package winnu.control;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import org.apache.torque.TorqueException;

import winnu.dao.ItemPeer;
import winnu.dao.Sale;
import winnu.dao.StockedItemPeer;
import winnu.dao.WithdrawnItem;
import winnu.dao.WithdrawnItemPeer;


@SuppressWarnings("unused")
public class ReplaceItemController {
	private List<WithdrawnItem> items;
	private WinnuControl control;
	
    public ReplaceItemController(WinnuControl control) {
    	this.control = control;
    }
    
    /** Replaces item i with quantity based on the reason */
    public boolean replaceItem(int i, int quantity, String reason) {
    	int itemId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getWithdrawnItemId();
    	int batchId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getItemBatchId();
    	int doctorId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getDoctorId();
    	int saleId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getSaleId();
    	int userId = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getUserId();
    	String date = WithdrawnItemPeer.retrieveWithdrawnItem(items.get(i).getWithdrawnItemId()).getDateWithdrawn();
    	
    	System.out.println("\n\n\n " + quantity + " - " + WithdrawnItemPeer.retrieveAllItemBatchId(Integer.toString(batchId)).get(i).getQuantity() + " \n\n\n");
    	
    	if(quantity <= WithdrawnItemPeer.retrieveAllItemBatchId(Integer.toString(batchId)).get(i).getQuantity()
    			&& quantity > 0) {
	    	int addedToStocks = StockedItemPeer.retrieveAllItemBatchId(batchId).get(0).getQuantity() + quantity;
	    	int removedFromWithdrawn = WithdrawnItemPeer.retrieveUsingSaleId(batchId, saleId).get(0).getQuantity() - quantity;
	    	float currentPrice = (float)StockedItemPeer.retrieveAllItemBatchId(batchId).get(0).getCurrentPrice();
	    	float sellingPrice = (float)WithdrawnItemPeer.retrieveAllItemBatchId(Integer.toString(batchId)).get(0).getSellingPrice();
	    	
	    	StockedItemPeer.updateStockedItem(batchId, currentPrice, addedToStocks, batchId);
	    	WithdrawnItemPeer.updateWithdrawnItem(itemId, sellingPrice, removedFromWithdrawn, date, "Sale/Replacement", doctorId, saleId, batchId, userId);
	    	
	    	return true;
    	}
    	else {
    		return false;
    	}
    }
    
    /** Get all withdrawn items based on brand name */
    public DefaultListModel getWithdrawnItems(String brandName) {
		DefaultListModel lstModel = new DefaultListModel();
    	WithdrawnItem ci;
    	Sale sale;
		items = WithdrawnItemPeer.retrieveAllByItemBrandName(brandName);
		
		//clears list model
		lstModel.clear();
		
		//traverse the items and store details per item
		for(int i=0; i<items.size(); i++){
			ci = items.get(i);
			
			try {
	 			if((sale=ci.getSale()) != null) {
	 				lstModel.add(i, "SaleID: " + sale.getSaleId() 
	 						+ "  -  Batch: " + ci.getItemBatchId() 
	 						+ "  -  Date: " + sale.getSaleDate() 
	 						+ "  -  Quantity: " + ci.getQuantity() 
	 						+ "  -  Customer: " + sale.getCustomerName());
	 			}
	 		}
			catch (TorqueException e) {
	 			e.printStackTrace();
	 		}
	 	}
		
		return(lstModel);
    }
}
