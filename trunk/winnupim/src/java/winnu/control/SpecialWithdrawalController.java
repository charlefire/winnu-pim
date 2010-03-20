package winnu.control;

import java.util.*;
import javax.swing.DefaultListModel;
import winnu.dao.ItemBatchPeer;
import winnu.dao.ItemBatch;
import winnu.dao.ItemPeer;
import winnu.dao.StockedItemPeer;
import winnu.dao.WithdrawnItemPeer;


public class SpecialWithdrawalController {
	private List<Integer> itemBatch = new ArrayList<Integer>();
	private WinnuControl control;
	
    public SpecialWithdrawalController(WinnuControl control){
		this.control = control;
    }

    public boolean withdrawItem(String brandName, int i, int quantity, String reason) {    	
    	System.out.print(itemBatch.get(i) + " - " + ItemBatchPeer.retrieveAllBatchNo(ItemPeer.retrieveItemId(brandName)).size());

    	int batchId = StockedItemPeer.retrieveAllItemBatchId(i+1).get(0).getItemBatchId();
    	int itemId = ItemPeer.retrieveItemId(brandName);
    	
    	if(quantity < (StockedItemPeer.retrieveUsingBatchId(batchId).get(0).getQuantity()
    					- ItemPeer.retrieveItem(itemId).getMinimumSupplyLimit())) {
			int removedFromStocked = StockedItemPeer.retrieveUsingBatchId(batchId).get(0).getQuantity() - quantity;
			float currentPrice = (float)StockedItemPeer.retrieveAllItemBatchId(batchId).get(0).getCurrentPrice();
			int userId = control.getCurrentUser().getUserId();
			java.util.Date today = new java.util.Date();
	    	long t = today.getTime();
	    	java.sql.Date date = new java.sql.Date(t);
			
			StockedItemPeer.updateStockedItem(batchId, currentPrice, removedFromStocked, batchId);
			WithdrawnItemPeer.addWithdrawnItem(0, date, reason, batchId, userId, quantity);
			
			System.out.print(itemBatch.get(i) + " - " + quantity);
			
			return true;
    	}
    	else
    		return false;
    }

    public DefaultListModel getItemDetails(String brandName) {
    	DefaultListModel items = new DefaultListModel();
    	items.clear();
    	List<ItemBatch> itemBatches = new ArrayList<ItemBatch>();
    	itemBatches.clear();
    	itemBatches = ItemBatchPeer.retrieveAllBatchNo(ItemPeer.retrieveItemId(brandName));
    	int maxBatchNo = itemBatches.size();
    	
    	if(maxBatchNo > 0 && itemBatches.size() > 0) {
	    	for(int i = 0; i < maxBatchNo; i++) {
	    		itemBatch.add(i, itemBatches.get(i).getBatchNo());
	    		items.add(i, "Batch: " + Integer.toString(itemBatches.get(i).getBatchNo()) 
	    				+ " - Quantity: " + StockedItemPeer.retrieveAllItemBatchId(itemBatches.get(i).getItemBatchId()).get(0).getQuantity());
	    	
	    		System.out.print("Batch: " + i + " - " + StockedItemPeer.retrieveAllItemBatchId(itemBatches.get(i).getItemBatchId()).get(0).getQuantity());
	    	}
	    }
    	return items;
    }

}
