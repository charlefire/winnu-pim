package winnu.control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

import org.apache.torque.TorqueException;

import winnu.dao.ItemPeer;
import winnu.dao.Sale;
import winnu.dao.ItemBatch;
import winnu.dao.StockedItem;
import winnu.dao.StockedItemPeer;
import winnu.dao.WithdrawnItem;
import winnu.dao.WithdrawnItemPeer;
import winnu.dao.ItemBatchPeer;


public class ReplaceItemController {
	private List<WithdrawnItem> items;
	private WinnuControl control;
	
    public ReplaceItemController(WinnuControl control) {
    	this.control = control;
    }

    public void replaceItem(int i, int quantity, String reason) {
    	String itemName = control.getCurrentSelectedItem().getBrandName();
    	int itemId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getWithdrawnItemId();
    	int batchId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getItemBatchId();
    	int doctorId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getDoctorId();
    	int saleId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getSaleId();
    	int userId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getUserId();
    	String date = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getDateWithdrawn();
    	
		try {
			String customer = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getItemBatchId()).getSale().getCustomerName();
		} catch (TorqueException e) {
			e.printStackTrace();
		}
    	
    	int addedToStocked = StockedItemPeer.retrieveAllItemBatchId(batchId).get(0).getQuantity() + quantity;
    	int removedFromWithdrawn = WithdrawnItemPeer.retrieveUsingSaleId(batchId, saleId).get(0).getQuantity() - quantity;
    	float currentPrice = (float)StockedItemPeer.retrieveAllItemBatchId(batchId).get(0).getCurrentPrice();
    	float sellingPrice = (float)WithdrawnItemPeer.retrieveAllItemBatchId(Integer.toString(batchId)).get(0).getSellingPrice();
    	
    	StockedItemPeer.updateStockedItem(batchId, currentPrice, addedToStocked, batchId);
    	WithdrawnItemPeer.updateWithdrawnItem(itemId, sellingPrice, removedFromWithdrawn, date, "Sale/Replacement", doctorId, saleId, batchId, userId);
    }
    
    public DefaultListModel getWithdrawnItems() {
		DefaultListModel lstModel = new DefaultListModel();
    	WithdrawnItem ci;
    	Sale sale;
		items = WithdrawnItemPeer.retrieveAllByItemBrandName(control.getCurrentSelectedItem().getBrandName());
		
		lstModel.clear();
		
		for(int i=0;i<items.size();i++){
			ci = items.get(i);
	
			try {
	 			if((sale=ci.getSale())!=null) {
	 				lstModel.add(i, "SaleID: " + sale.getSaleId() + "  -  Batch: " + ci.getItemBatchId() +"  -  Date: " + sale.getSaleDate() + "  -  Quantity: " + ci.getQuantity() + "  -  Customer: " + sale.getCustomerName());
	 			}
	 		} catch (TorqueException e) {
	 			e.printStackTrace();
	 		}
	 	}
		
		return(lstModel);
    }
    
    public static ItemBatch getItemBatch(WithdrawnItem wi){
    	ItemBatch ib;
    	
    	try {
			ib = wi.getItemBatch();
	    	return ib;
		} catch (TorqueException e) {
			e.printStackTrace();
			return null;
		}    	
    }    
    
}
