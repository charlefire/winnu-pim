package winnu.control;

import java.util.List;
import javax.swing.DefaultListModel;

import org.apache.torque.TorqueException;

import winnu.dao.Sale;
import winnu.dao.ItemBatch;
import winnu.dao.WithdrawnItem;
import winnu.dao.WithdrawnItemPeer;


public class ReplaceItemController {
	private List<WithdrawnItem> items;
	private WinnuControl control;
	
    public ReplaceItemController(WinnuControl control) {
    	this.control = control;
    }

    public boolean replaceItem(){
        return true;
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
	 			if((sale=ci.getSale())!=null){
	 				lstModel.add(i, "SaleID: " + sale.getSaleId() + " -- Batch: " + ci.getItemBatchId() +" -- Date: " + sale.getSaleDate() + " -- Quantity: " + ci.getQuantity() + " -- Customer: " + sale.getCustomerName());
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
