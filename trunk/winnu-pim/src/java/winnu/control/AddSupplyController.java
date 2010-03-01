package winnu.control;
import java.sql.Date;

import winnu.dao.ItemPeer;
import winnu.dao.ItemBatchPeer;
import winnu.dao.StockedItemPeer;
import winnu.dao.SupplierPeer;

public class AddSupplyController {
    public AddSupplyController(){
    }

    public boolean addSupply(String brandName, Date expirationDate, String supplierName, String supplierAddress, String supplierContactNo, float currentprice, int initialQuantity, float acquisitionCost){
    	int itemBatchId;
		int supplierId;
		int itemId;
		int batchNo;
				
		itemId = ItemPeer.retrieveAllBrandName(brandName).get(0).getItemId();
		    	
    	if(SupplierPeer.isExisting(supplierName)){
			supplierId = SupplierPeer.retrieveAllName(supplierName).get(0).getSupplierId();    			
		}else{
			SupplierPeer.addSupplier(supplierName, supplierAddress, supplierContactNo); 	
			supplierId = SupplierPeer.getMaxSupplierId();    			
		}
		
    	batchNo = ItemBatchPeer.getMaxItemBatchNo(brandName) + 1;
    	
		ItemBatchPeer.addItemBatch(batchNo, expirationDate, supplierId, itemId, acquisitionCost);
		itemBatchId = ItemBatchPeer.getMaxItemBatchId();
		
		StockedItemPeer.addStockedItem(currentprice, initialQuantity, itemBatchId);
    	
        return true;
    }

}
