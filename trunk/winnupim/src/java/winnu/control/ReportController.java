package winnu.control;

import java.util.ArrayList;
import java.util.List;

import org.apache.torque.TorqueException;

import winnu.dao.Item;
import winnu.dao.ItemBatch;
import winnu.dao.ItemBatchPeer;
import winnu.dao.ItemPeer;
import winnu.dao.StockedItem;
import winnu.dao.StockedItemPeer;
import winnu.dao.WithdrawnItem;
import winnu.dao.WithdrawnItemPeer;

public class ReportController {

	public static List<Item> retrieveFromItem(){
		return (List<Item>)ItemPeer.retrieveAllItems();
	}
	
	public static Object[][] retrieveAvailableInventory(){
		List<Item> list = ReportController.retrieveFromItem();
        Item item;
        StockedItem stockedItem;
        ItemBatch itemBatch;

        Object[][] modelObject = new Object[list.size()][];         
        
        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	itemBatch = ItemBatchPeer.retrieveItemLatestBatch(item.getItemId(), item.getNextBatch());
        	stockedItem = StockedItemPeer.retrieveAllItemBatchId(itemBatch.getItemBatchId()).get(0);
        	
        	Object[] model = null;
			try {
				model = new Object[]{item.getItemId(),item.getBrandName() ,item.getGenericName(),itemBatch.getSupplier().getSupplierName(), ItemPeer.getTotalQuantity(item.getBrandName()), "pcs", itemBatch.getAcquisitionCost(), stockedItem.getCurrentPrice()};
	        	modelObject[i]= model;     
			} catch (TorqueException e) {
				e.printStackTrace();
			}
        }           
        
        return modelObject;        
	}
	
	public static Object[][] retrieveAvailableInventoryByGenericName(String genericName){
		List<Item> list;
        Item item;
        StockedItem stockedItem;
        ItemBatch itemBatch;

        if(genericName=="" || genericName=="<Enter the Generic Name of the drug here>"){
        	list = ItemPeer.retrieveAllItems();
        }else{
        	list = ItemPeer.retrieveAllGenericName(genericName);
        }
        
        Object[][] modelObject = new Object[list.size()][];         
        
        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	itemBatch = ItemBatchPeer.retrieveItemLatestBatch(item.getItemId(), item.getNextBatch());
        	stockedItem = StockedItemPeer.retrieveAllItemBatchId(itemBatch.getItemBatchId()).get(0);
        	
        	Object[] model = null;
			try {
				model = new Object[]{item.getItemId(),item.getBrandName() ,itemBatch.getSupplier().getSupplierName(), ItemPeer.getTotalQuantity(item.getBrandName()), "pcs", itemBatch.getAcquisitionCost(), stockedItem.getCurrentPrice()};
	        	modelObject[i]= model;     
			} catch (TorqueException e) {
				e.printStackTrace();
			}
        }                   
        return modelObject;        
	}
	

	public static Object[][] retrieveAvailableInventoryBySupplier(){
		List<Item> list = ReportController.retrieveFromItem();
        Item item;
        StockedItem stockedItem;
        ItemBatch itemBatch;

        Object[][] modelObject = new Object[list.size()][];         
        
        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	itemBatch = ItemBatchPeer.retrieveItemLatestBatch(item.getItemId(), item.getNextBatch());
        	stockedItem = StockedItemPeer.retrieveAllItemBatchId(itemBatch.getItemBatchId()).get(0);
        	
        	Object[] model = null;
			model = new Object[]{item.getItemId(),item.getBrandName(), item.getGenericName(), ItemPeer.getTotalQuantity(item.getBrandName()), "pcs", itemBatch.getAcquisitionCost(), stockedItem.getCurrentPrice()};
			modelObject[i]= model;
        }           
        
        return modelObject;        
	}
	
	public static Object[][] retrieveItemsForReorder(){
		List<Item> list = ReportController.retrieveFromItem();
        Item item;
        StockedItem stockedItem;
        ItemBatch itemBatch;
        int count=0;

        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	
        	if(ItemPeer.getTotalQuantity(item.getBrandName()) < item.getMinimumSupplyLimit() ){
        		count++;
        	}
        }           
        Object[][] modelObject = new Object[count][];         
        
        count=0;
        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	itemBatch = ItemBatchPeer.retrieveItemLatestBatch(item.getItemId(), item.getNextBatch());
        	stockedItem = StockedItemPeer.retrieveAllItemBatchId(itemBatch.getItemBatchId()).get(0);
        	
        	if(ItemPeer.getTotalQuantity(item.getBrandName()) < item.getMinimumSupplyLimit() ){
        		Object[] model = null;
        		
				try {
					model = new Object[]{item.getItemId(),item.getBrandName(), item.getGenericName(), itemBatch.getSupplier().getSupplierName(), ItemPeer.getTotalQuantity(item.getBrandName()), "pcs", itemBatch.getAcquisitionCost(), stockedItem.getCurrentPrice()};
				} catch (TorqueException e) {
					e.printStackTrace();
				}
				
				modelObject[count]= model;
				count++;
        	}else{
        		
        	}
        }           
        
        return modelObject;        
	}
	
	public static Object[][] retrieveWithdrawnItem(){
		List<WithdrawnItem> list = WithdrawnItemPeer.retrieveAll();
        WithdrawnItem item;
        ItemBatch itemBatch;
        Item itemName;
        
        int count=0;
        
        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	
        	if(list.get(i).getReason().equals("Sale")){
        		count++;
        	}
        }                  

        Object[][] modelObject = new Object[count][];         
        
        for(int i=0; i< list.size(); i++){
        	if(list.get(i).getReason().equals("Sale")){
	        	item = list.get(i);
	        	itemBatch = ItemBatchPeer.retrieveItemBatch(item.getItemBatchId());
	        	itemName = ItemPeer.retrieveItem(itemBatch.getItemId());
	        	
	        	Object[] model = null;
				try {
					model = new Object[]{item.getDateWithdrawn(),item.getSaleId(), itemBatch.getItemId(), itemName.getBrandName() , itemName.getGenericName(), itemBatch.getSupplier().getSupplierName(), item.getSale().getCustomerName(), item.getQuantity(), "pcs", itemBatch.getAcquisitionCost(), item.getSellingPrice()};
				} catch (TorqueException e) {
					e.printStackTrace();
				}
				modelObject[i]= model;
        	}
        }           
        
        return modelObject;        
	}
	

	public static Object[][] retrieveSales(){
		List<WithdrawnItem> list = WithdrawnItemPeer.retrieveSoldItems();
        WithdrawnItem item;
        ItemBatch itemBatch;
        Item itemName;

        Object[][] modelObject = new Object[list.size()][];         
        
        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	itemBatch = ItemBatchPeer.retrieveItemBatch(item.getItemBatchId());
        	itemName = ItemPeer.retrieveItem(itemBatch.getItemId());
        	
        	Object[] model = null;
			try {
				model = new Object[]{item.getDateWithdrawn(),item.getSaleId(), itemBatch.getItemId(), itemName.getBrandName() , itemName.getGenericName(), itemBatch.getSupplier().getSupplierName(), item.getSale().getCustomerName(), item.getQuantity(), "pcs", itemBatch.getAcquisitionCost(), item.getSellingPrice(), item.getReason()};
			} catch (TorqueException e) {
				e.printStackTrace();
			}
			modelObject[i]= model;
        }           
        
        return modelObject;        
	}
	
	public static Object[][] retrieveSalesPerPatient(){
		List<WithdrawnItem> list = WithdrawnItemPeer.retrieveSoldItems();
        WithdrawnItem item;
        ItemBatch itemBatch;
        Item itemName;

        Object[][] modelObject = new Object[list.size()][];         
        
        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	itemBatch = ItemBatchPeer.retrieveItemBatch(item.getItemBatchId());
        	itemName = ItemPeer.retrieveItem(itemBatch.getItemId());
        	
        	Object[] model = null;
			try {
				model = new Object[]{item.getDateWithdrawn(),item.getSaleId(), itemBatch.getItemId(), itemName.getBrandName() , itemName.getGenericName(), itemBatch.getSupplier().getSupplierName(), item.getSale().getCustomerName(), item.getQuantity(), "pcs", itemBatch.getAcquisitionCost(), item.getSellingPrice(), item.getReason()};
			} catch (TorqueException e) {
				e.printStackTrace();
			}
			modelObject[i]= model;
        }                   
        return modelObject;       
	}
	
	public static Object[][] retrieveSRDP(){
		List<WithdrawnItem> list = WithdrawnItemPeer.retrieveAll();
        WithdrawnItem item;
        ItemBatch itemBatch;
        Item itemName;

        Object[][] modelObject = new Object[list.size()][];         
        
        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	itemBatch = ItemBatchPeer.retrieveItemBatch(item.getItemBatchId());
        	itemName = ItemPeer.retrieveItem(itemBatch.getItemId());
        	
        	Object[] model = null;
			try {
				model = new Object[]{item.getDateWithdrawn(),item.getSaleId(), itemBatch.getItemId(), itemName.getBrandName() , itemName.getGenericName(), itemBatch.getSupplier().getSupplierName(), item.getQuantity(), "pcs", itemBatch.getAcquisitionCost(), item.getSellingPrice(), item.getReason()};			
			} catch (TorqueException e) {
				e.printStackTrace();
			}
			modelObject[i]= model;
        }           
        
        return modelObject;        
	}
	
	
	public static Object[][] retrieveDrugsPurchased(){
		List<StockedItem> list = StockedItemPeer.retrieveAll();
        StockedItem item;
        ItemBatch itemBatch;
        Item itemName;

        Object[][] modelObject = new Object[list.size()][];         
        
        for(int i=0; i< list.size(); i++){
        	item = list.get(i);
        	itemBatch = ItemBatchPeer.retrieveItemBatch(item.getItemBatchId());
        	itemName = ItemPeer.retrieveItem(itemBatch.getItemId());
        	
        	Object[] model = null;
			try {
				model = new Object[]{item.getItemBatch().getPurchasedDate(), itemBatch.getItemId(), itemName.getBrandName() , itemName.getGenericName(), itemBatch.getSupplier().getSupplierName(), item.getQuantity(), "pcs", itemBatch.getAcquisitionCost(), item.getCurrentPrice()};			
			} catch (TorqueException e) {
				e.printStackTrace();
			}
			modelObject[i]= model;
        }           
        
        return modelObject;        
	}
	
	public static Object[][] retrieveDrugsExpiring(){
		List<StockedItem> list = StockedItemPeer.retrieveAll();
		List<StockedItem> filteredList = new ArrayList();
        StockedItem stockedItem;

        java.util.Date today = new java.util.Date();
    	long t = today.getTime();
    	String dt = new java.sql.Date(t).toString();   	
    	
    	
        for(int i=0; i< list.size(); i++){
        	stockedItem = list.get(i);
        	try {
				try {
					if(getDateDifference(dt, stockedItem.getItemBatch().getExpirationDate()) <= 3){
						filteredList.add(stockedItem);
					}
				} catch (TorqueException e) {
					e.printStackTrace();
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
			
        }           
        Object[][] modelObject = new Object[filteredList.size()][];  
               
        for(int i=0; i< filteredList.size(); i++){
        	stockedItem = filteredList.get(i);
        	
        	try {
        		if(getDateDifference(dt, stockedItem.getItemBatch().getExpirationDate()) <= 3){
        			Object[] model = null;
        			model = new Object[]{stockedItem.getItemBatch().getItemBatchId(),stockedItem.getItemBatch().getItem().getBrandName(), stockedItem.getItemBatch().getItem().getGenericName(), stockedItem.getItemBatch().getSupplier().getSupplierName(), ItemPeer.getTotalQuantity(stockedItem.getItemBatch().getItem().getBrandName()), "pcs", stockedItem.getItemBatch().getAcquisitionCost(), stockedItem.getCurrentPrice()};
					
					modelObject[i]= model;
				}else{
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (TorqueException e) {
				e.printStackTrace();
			}
			
        }           
        
        return modelObject;        
	}
	
	@SuppressWarnings("unused")
	private static int getDateDifference(String date1, String date2){
		//date 1 is sysdate
		//date 2 is expiration date
		
		String d1month = date1.toString().substring(5, 7);
		String d2month = date2.toString().substring(5, 7);
		String d1year = date1.toString().substring(0, 4);
		String d2year = date2.toString().substring(0, 4);
		String d1day = date1.toString().substring(8, 10);
		String d2day = date2.toString().substring(8, 10); 		
		
		if(Integer.parseInt(d1year) < Integer.parseInt(d2year)){
			//sysdate is less than expiration
			if((Integer.parseInt(d2month) == 1)){
				return(13 - Integer.parseInt(d1month));
			}
			else if(Integer.parseInt(d2month) == 2){
				return((13 - Integer.parseInt(d1month))+ 1);
			}
			else if(Integer.parseInt(d2month) == 3){
				return((13 - Integer.parseInt(d1month))+ 2);
			}
			else{
				return 4;
			}
			
			
		}else if(Integer.parseInt(d1year) == Integer.parseInt(d2year)){
			//else equal
			if(Integer.parseInt(d2month) >= Integer.parseInt(d1month)){
				return (Integer.parseInt(d2month)-Integer.parseInt(d1month));
			}else{
				return 4;
			}
		}
		else{
			//greater than
			//ignore
			return 4;
		}	
		
	}
	

}
