package winnu.control;

import java.sql.Date;

import winnu.dao.ItemBatchPeer;
import winnu.dao.ItemPeer;
import winnu.dao.StockedItemPeer;
import winnu.dao.SupplierPeer;


public class AddItemController {
	WinnuControl control;
	
    public AddItemController(WinnuControl control){
    	this.control = control;
    }
    
    public boolean addItem(String genericName, 
    		String brandName,
    		Date expirationDate,
    		String supplierName,
    		String supplierAddress,
    		String supplierContactNo,
    		String classification, 
    		String type,
    		Integer initialQuantity,
    		Float salesPrice,
    		Float acquisitionCost,
    		Integer minimumSupplyLimit){
    	
    		int itemId;
    		int itemBatchId;
    		int supplierId;
    		
    	
    		ItemPeer.addItem(genericName, brandName, classification, type, minimumSupplyLimit,control.getCurrentUser().getUserId());
    		
    		itemId = ItemPeer.getMaxItemId();
    		    		
    		if(SupplierPeer.isExisting(supplierName)){
    			supplierId = SupplierPeer.retrieveAllName(supplierName).get(0).getSupplierId();    			
    		}else{
    			SupplierPeer.addSupplier(supplierName, supplierAddress, supplierContactNo); 	
    			supplierId = SupplierPeer.getMaxSupplierId();    			
    		}
    		    		
    		ItemBatchPeer.addItemBatch(0, expirationDate, supplierId, itemId, acquisitionCost);
    		itemBatchId = ItemBatchPeer.getMaxItemBatchId();
    		
    		StockedItemPeer.addStockedItem(salesPrice, initialQuantity, itemBatchId);
    		
    	return true;
    }
    
    public boolean isExistingSupplier(String supplierName){
    	return true;
    }
}
