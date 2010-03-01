package winnu.control;

import java.util.ArrayList;
import java.util.List;

import org.apache.torque.util.Criteria;

import winnu.dao.Item;
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

    public boolean executeSale(String customer_name, String reason){     
    	java.util.Date today = new java.util.Date();
    	long t = today.getTime();
    	java.sql.Date dt = new java.sql.Date(t);
    	
    	int doctor_id=0;
    	int sale_id=0;
    	int itemBatchId=0;
    	int remainingItems = 0;
    	int userId =control.getCurrentUser().getUserId();
    	    	
    	for(int i=0;i<itemList.size();i++){    		
    		SalePeer.addSale(customer_name, dt, 20, userId);
    		remainingItems = quantityList.get(i);
    		
    		while(remainingItems>0){
        		itemBatchId = itemList.get(i).getNextBatch();
        		StockedItem si = (StockedItem)StockedItemPeer.retrieveAllItemId(itemBatchId);
        		
        		if(si.getQuantity()<=remainingItems){
        			WithdrawnItemPeer.addWithdrawnItem((float)si.getCurrentPrice(), today, reason, doctor_id, sale_id, itemBatchId, userId, si.getQuantity());
        			StockedItemPeer.updateStocked_Item(si.getItemBatchId(), (float)si.getCurrentPrice(), 0, itemBatchId);
        		}else{
        			//TODO: KULANG PARIN TO!        			
        		}
        		
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
    
    public void newSale(){
		itemList = new ArrayList();
		quantityList = new ArrayList();
	}
    
    public void overrideSale(int index){
    	itemList.remove(index);    	
    }
    
}
