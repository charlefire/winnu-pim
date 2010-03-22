package winnu.control;

import java.util.ArrayList;
import java.util.List;

import winnu.dao.DoctorPeer;
import winnu.dao.Item;
import winnu.dao.ItemBatchPeer;
import winnu.dao.ItemPeer;
import winnu.dao.SalePeer;
import winnu.dao.StockedItem;
import winnu.dao.StockedItemPeer;
import winnu.dao.WithdrawnItemPeer;


public class SaleController {
	public List<Item> itemList = null;
	public List<Integer> quantityList = null;
	private WinnuControl control;
	
	
	public SaleController(WinnuControl control){
		this.control = control;
		newSale();
    }

	public void removeItem(int i){
		itemList.remove(i);
		quantityList.remove(i);
		
	}
	
    public boolean executeSale(String customer_name, String reason,String doctorName, String doctorLisenceNo, String doctorS2No){     
    	int doctor_id=0;
    	int sale_id=0;
    	int nextBatch=0;
    	int itemBatch=0;
    	int remainingItems = 0;
    	int userId = control.getCurrentUser().getUserId();

    	java.util.Date today = new java.util.Date();
    	long t = today.getTime();
    	java.sql.Date dt = new java.sql.Date(t);
    	
    	// <------ HAVE TO FIX THIS PART --------------->

		SalePeer.addSale(customer_name, dt, 20, userId);
		sale_id = SalePeer.getMaxSaleId();
    	
    	if(DoctorPeer.retrieveAllName(doctorName).size()==0){
    		DoctorPeer.addDoctor(doctorName, doctorLisenceNo, doctorS2No);
    		doctor_id=DoctorPeer.getMaxDoctorId();
    	}else{
    		doctor_id=DoctorPeer.retrieveAllName(doctorName).get(0).getDoctorId();
    	}
    	
    	// <-------------------------------------------->
    	
		
    	for(int i=0;i<itemList.size();i++){
	    	remainingItems = quantityList.get(i);
	    	System.out.println(remainingItems);

    		nextBatch = itemList.get(i).getNextBatch();
	    	while(remainingItems>0){
		        	System.out.println("next batch: " + nextBatch);
		        	
		        	itemBatch = ItemBatchPeer.retrieveItemLatestBatch(itemList.get(i).getItemId(),nextBatch).getItemBatchId();
	        		System.out.println("remaining: " + remainingItems);
		        	
		        	ArrayList<StockedItem> siList = (ArrayList<StockedItem>)StockedItemPeer.retrieveAllItemBatchId(itemBatch);
		        	StockedItem si = siList.get(0);
		        	
		        	System.out.println(si.getQuantity());     
		        	
		        	if(remainingItems>=si.getQuantity()){
		        		StockedItemPeer.updateStockedItemQuantity(si.getStockedItemId(), 0);
		        		WithdrawnItemPeer.addWithdrawnItem((float)si.getCurrentPrice(), dt, reason, doctor_id, sale_id, itemBatch, userId, si.getQuantity());
		        		nextBatch++;
		        		ItemPeer.updateNextBatch(itemList.get(i).getItemId(), nextBatch);		        		
		        		remainingItems = remainingItems - si.getQuantity();		        		
		        	}else{
		        		StockedItemPeer.updateStockedItemQuantity(si.getStockedItemId(), si.getQuantity()-remainingItems);
		        		WithdrawnItemPeer.addWithdrawnItem((float)si.getCurrentPrice(), dt, "Sale", doctor_id, sale_id, itemBatch, userId, remainingItems);
		        		remainingItems = 0;	        		
		        	}	        	
		        	
	        		System.out.println("remaining items: " + remainingItems);
	    	}
    	}
   	
    	return true;
    }

    public boolean checkIfEmpty(){
        return true;
    }

    public boolean addItem(Item newItem, int newItemQuantity){
    	if(ItemPeer.getTotalQuantity(newItem.getBrandName()) >= newItemQuantity){
    		itemList.add(newItem);
    		quantityList.add(newItemQuantity); 
        	System.out.println(newItemQuantity + " " + newItem.getBrandName() + " was selected!");
    	}else{
    		System.out.println("Insufficient supply of item!");    		
    	}
    	return true;
    }
    
    @SuppressWarnings("unchecked")
	public void newSale(){
		itemList = new ArrayList();
		quantityList = new ArrayList();
	}
    
    public void overrideSale(int index){
    	itemList.remove(index);    	
    }
    
}
