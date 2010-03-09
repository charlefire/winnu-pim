package winnu.control;

import java.util.ArrayList;

import winnu.dao.Item;
import winnu.dao.ItemBatchPeer;
import winnu.dao.ItemPeer;
import winnu.dao.StockedItem;
import winnu.dao.StockedItemPeer;
import winnu.dao.WithdrawnItemPeer;


public class SpecialWithdrawalController {

	private WinnuControl control;

    public SpecialWithdrawalController(WinnuControl control){
		this.control = control;
    }

    public boolean withdrawItem(String brandName, Integer quantity, String reason){
    	int itemId,remainingItems,nextBatch,itemBatchId,userId;
    	Item itemToWithdraw = ItemPeer.retrieveAllBrandName(brandName).get(0);
    	
    	itemId = itemToWithdraw.getItemId();
    	userId = control.getCurrentUser().getUserId();
    	
    	java.util.Date today = new java.util.Date();
    	long t = today.getTime();
    	java.sql.Date dt = new java.sql.Date(t);
    	
    	remainingItems = quantity;
    	System.out.println(remainingItems);

		nextBatch = itemToWithdraw.getNextBatch();
    	while(remainingItems>0){
	        	System.out.println("next batch: " + nextBatch);
	        	
	        	itemBatchId = ItemBatchPeer.retrieveItemLatestBatch(itemToWithdraw.getItemId(),nextBatch).getItemBatchId();
        		System.out.println("remaining: " + remainingItems);
	        	
	        	ArrayList<StockedItem> siList = (ArrayList<StockedItem>)StockedItemPeer.retrieveAllItemBatchId(itemBatchId);
	        	StockedItem si = siList.get(0);
	        	
	        	System.out.println(si.getQuantity());     
	        	
	        	if(remainingItems>=si.getQuantity()){
	        		StockedItemPeer.updateStockedItemQuantity(si.getStockedItemId(), 0);
	        		WithdrawnItemPeer.addWithdrawnItem((float)si.getCurrentPrice(), dt, reason, itemBatchId, userId, si.getQuantity());
	        		nextBatch++;
	        		ItemPeer.updateNextBatch(itemToWithdraw.getItemId(), nextBatch);		        		
	        		remainingItems = remainingItems - si.getQuantity();		        		
	        	}else{
	        		StockedItemPeer.updateStockedItemQuantity(si.getStockedItemId(), si.getQuantity()-remainingItems);
	        		WithdrawnItemPeer.addWithdrawnItem((float)si.getCurrentPrice(), dt, reason, itemBatchId, userId, remainingItems);
	        		remainingItems = 0;	        		
	        	}	        	
	        	
        		System.out.println("remaining items: " + remainingItems);

    	System.out.println(itemId);
    	}
        return true;
    }
}
