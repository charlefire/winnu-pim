package winnu.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import com.workingdogs.village.DataSetException;
import com.workingdogs.village.Record;

@SuppressWarnings("serial")
public class ItemBatchPeer extends winnu.dao.BaseItemBatchPeer {	
	
	public static boolean addItemBatch(int batchNo, java.sql.Date expirationDate, int supplierId, int itemId, float acquisitionCost){
		Criteria criteria = new Criteria();
		criteria.add(ItemBatchPeer.BATCHNO, batchNo);
		criteria.add(ItemBatchPeer.EXPIRATIONDATE, expirationDate);
		criteria.add(ItemBatchPeer.SUPPLIERID, supplierId);
		criteria.add(ItemBatchPeer.ITEMID, itemId);
		criteria.add(ItemBatchPeer.ACQUISITIONCOST, acquisitionCost);
		
		java.util.Date today = new java.util.Date();
    	long t = today.getTime();
    	java.sql.Date dt = new java.sql.Date(t);
		
		criteria.add(ItemBatchPeer.PURCHASEDDATE, dt);
		
		try{
			ItemBatchPeer.doInsert(criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}	

	//retrieve item batch using id
	public static ItemBatch retrieveItemBatch(int id){
		Criteria criteria = new Criteria();
		criteria.add(ItemBatchPeer.ITEMBATCHID, id);
		try{
			return (ItemBatch)ItemBatchPeer.doSelect(criteria).get(0);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public static ItemBatch retrieveItemLatestBatch(int id, int batchno){
		Criteria criteria = new Criteria();
		criteria.add(ItemBatchPeer.ITEMID, id);
		criteria.add(ItemBatchPeer.BATCHNO, batchno);
		try{
			return (ItemBatch)ItemBatchPeer.doSelect(criteria).get(0);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}		
	}
	
	//retrieve using batch no
	@SuppressWarnings("unchecked")
	public static List<ItemBatch> retrieveAllBatchNo(int itemId){
		Criteria criteria = new Criteria();
		criteria.add(ItemBatchPeer.ITEMID, itemId);
		try{
			return (List<ItemBatch>)ItemBatchPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<ItemBatch>();
		}
	}

	//retrieve using expiration date
	@SuppressWarnings("unchecked")
	public static List<ItemBatch> retrieveAllExpirationDate(String query){
		Criteria criteria = new Criteria();
		criteria.add(ItemBatchPeer.EXPIRATIONDATE, query);
		try{
			return (List<ItemBatch>)ItemBatchPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<ItemBatch>();
		}
	}
	
	//retrieve using supplier id
	@SuppressWarnings("unchecked")
	public static List<ItemBatch> retrieveAllSupplierId(String query){
		Criteria criteria = new Criteria();
		criteria.add(ItemBatchPeer.SUPPLIERID, query);
		try{
			return (List<ItemBatch>)ItemBatchPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<ItemBatch>();
		}
	}

	//retrieve using item id
	@SuppressWarnings("unchecked")
	public static List<ItemBatch> retrieveAllItemId(int itemId){
		Criteria criteria = new Criteria();
		criteria.add(ItemBatchPeer.ITEMID, itemId);
		try{
			return (List<ItemBatch>)ItemBatchPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<ItemBatch>();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static int getMaxItemBatchNo(String brandName){		
		Criteria itemcriteria = new Criteria();		
		itemcriteria.add(ItemPeer.BRANDNAME, brandName);
		
		Item selectedItem = null;
		
		try {
			selectedItem = (Item)ItemPeer.doSelect(itemcriteria).get(0);
		} catch (TorqueException e) {
			e.printStackTrace();
		}
		
		int itemId = selectedItem.getItemId();
		
		Criteria itembatchCriteria = new Criteria();
		itembatchCriteria.add(ItemBatchPeer.ITEMID,itemId);
				
		itembatchCriteria.addSelectColumn("MAX(" + ItemBatchPeer.BATCHNO +")");
		
		try {
			List result = (List<User>)ItemBatchPeer.doSelectVillageRecords(itembatchCriteria);
			Record record = (Record)result.get(0);
			return record.getValue(1).asInt();
		} catch (TorqueException e1) {
			e1.printStackTrace();
		} catch (DataSetException e) {
			e.printStackTrace();
		}

		return -1;
	}
	
	@SuppressWarnings("unchecked")
	public static int getMaxItemBatchId(){
		Criteria maximum = new Criteria();
		maximum.addSelectColumn("MAX(" + ItemBatchPeer.ITEMBATCHID +")");
		
		try {
			List result = (List<User>)ItemBatchPeer.doSelectVillageRecords(maximum);
			Record record = (Record)result.get(0);
			return record.getValue(1).asInt();
		} catch (TorqueException e1) {
			e1.printStackTrace();
		} catch (DataSetException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
}
