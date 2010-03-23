package winnu.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.torque.util.Criteria;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Mon Feb 15 20:18:02 SGT 2010]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
@SuppressWarnings("serial")
public class WithdrawnItemPeer extends winnu.dao.BaseWithdrawnItemPeer {
	
	public static boolean addWithdrawnItem(float sellingPrice, java.util.Date dateWithdrawn, String reason, int doctorId, int saleId, int itemBatchId, int userId, int quantity){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.SELLINGPRICE, sellingPrice);
		criteria.add(WithdrawnItemPeer.DATEWITHDRAWN, dateWithdrawn);
		criteria.add(WithdrawnItemPeer.REASON, reason);
		criteria.add(WithdrawnItemPeer.DOCTORID, doctorId);
		criteria.add(WithdrawnItemPeer.SALEID, saleId);
		criteria.add(WithdrawnItemPeer.ITEMBATCHID, itemBatchId);
		criteria.add(WithdrawnItemPeer.QUANTITY, quantity);
		criteria.add(WithdrawnItemPeer.USERID, userId);
		
		try{
			WithdrawnItemPeer.doInsert(criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	

	//retrieve withdrawn using id
	public static WithdrawnItem retrieveWithdrawnItem(int id){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.WITHDRAWNITEMID, id);
		try{
			return (WithdrawnItem)WithdrawnItemPeer.doSelect(criteria).get(0);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	//retrieve withdrawn using id
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAll(){
		Criteria criteria = new Criteria();
		try{
			return WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}
	
	//retrieve using selling price
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAllSellingPrice(String query){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.SELLINGPRICE, query);
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}

	//retrieve using date withdrawn
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAllDateWithdrawn(String query){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.DATEWITHDRAWN, query);
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}
	
	//retrieve using reason
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAllReason(String query){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.REASON, query);
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}
	
	//retrieve using quantity
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAllQuantity(String query){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.QUANTITY, query);
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}
	
	//retrieve using doctor id
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAllDoctorId(int query){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.DOCTORID, query);
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAllRegulatedUsingDoctorId(int doctorId){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.DOCTORID, doctorId);
		criteria.add(WithdrawnItemPeer.ITEMBATCHID,ItemBatchPeer.ITEMBATCHID);
		criteria.add(ItemBatchPeer.ITEMID,ItemPeer.ITEMID);
		
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}
	
	//retrieve using sale id
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAllSaleId(String query){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.SALEID, query);
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}
	
	//retrieve using item batch id
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAllItemBatchId(String query){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.ITEMBATCHID, query);
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}
	
	//retrieve using user id
	@SuppressWarnings("unchecked")
	public static List<WithdrawnItem> retrieveAllUserId(String query){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.USERID, query);
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}

	public static List<WithdrawnItem> retrieveAllByItemBrandName(String brandName){
		List<WithdrawnItem> results = new ArrayList<WithdrawnItem>();
		List<WithdrawnItem> resultList = new ArrayList<WithdrawnItem>();
		
		int itemId = ItemPeer.retrieveItemId(brandName);
		
		List<ItemBatch> itemBatch = ItemBatchPeer.retrieveAllItemId(itemId);

		for(int i=0; i<itemBatch.size(); i++){
			Criteria criteria = new Criteria();
			criteria.add(WithdrawnItemPeer.ITEMBATCHID, itemBatch.get(i).getItemBatchId());
			
			try {
				resultList = (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
				for(int j=0; j < resultList.size(); j++)
					results.add(resultList.get(j));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return results;
	}
	
	//update withdrawn item
	public static boolean updateWithdrawnItem(int withdrawnItemId, float sellingPrice, int quantity, String dateWithdrawn, String reason, int doctorId, int saleId, int itemBatchId, int userId){
		Criteria selectCriteria = new Criteria();
		selectCriteria.add(WithdrawnItemPeer.WITHDRAWNITEMID, withdrawnItemId);
		
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.SELLINGPRICE, sellingPrice);
		criteria.add(WithdrawnItemPeer.DATEWITHDRAWN, dateWithdrawn);
		criteria.add(WithdrawnItemPeer.REASON, reason);
		criteria.add(WithdrawnItemPeer.QUANTITY, quantity);
		criteria.add(WithdrawnItemPeer.DOCTORID, doctorId);
		criteria.add(WithdrawnItemPeer.SALEID, saleId);
		criteria.add(WithdrawnItemPeer.ITEMBATCHID, itemBatchId);
		criteria.add(WithdrawnItemPeer.USERID, userId);
		
		try{
			UserPeer.doUpdate(selectCriteria, criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public static boolean addWithdrawnItem(float currentPrice, Date dt, String reason, int itemBatchId, int userId, int quantity) {
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.SELLINGPRICE, 0);
		criteria.add(WithdrawnItemPeer.DATEWITHDRAWN, dt);
		criteria.add(WithdrawnItemPeer.REASON, reason);
		criteria.add(WithdrawnItemPeer.ITEMBATCHID, itemBatchId);
		criteria.add(WithdrawnItemPeer.QUANTITY, quantity);
		criteria.add(WithdrawnItemPeer.USERID, userId);
		
		try{
			WithdrawnItemPeer.doInsert(criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}		
	}

	public static List<WithdrawnItem> retrieveUsingSaleId(int itemBatchId, int saleId){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.ITEMBATCHID, itemBatchId);
		criteria.add(WithdrawnItemPeer.SALEID, saleId);
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}


	public static List<WithdrawnItem> retrieveSoldItems(){
		Criteria criteria = new Criteria();
		criteria.add(WithdrawnItemPeer.REASON, "Sale");
		try{
			return (List<WithdrawnItem>)WithdrawnItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<WithdrawnItem>();
		}
	}
	
}
