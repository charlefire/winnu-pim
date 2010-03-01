package winnu.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.torque.util.Criteria;

@SuppressWarnings("serial")
public class StockedItemPeer extends winnu.dao.BaseStockedItemPeer {
	
	public static boolean addStockedItem(float currentPrice, int quantity, int itemBatchId){
		Criteria criteria = new Criteria();
		criteria.add(StockedItemPeer.CURRENTPRICE, currentPrice);
		criteria.add(StockedItemPeer.QUANTITY, quantity);
		criteria.add(StockedItemPeer.ITEMBATCHID, itemBatchId);
		
		try{
			StockedItemPeer.doInsert(criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	

	//retrieve stocked item using id
	public static StockedItem retrieveStockedItem(String id){
		Criteria criteria = new Criteria();
		criteria.add(StockedItemPeer.STOCKEDITEMID, id);
		try{
			return (StockedItem)StockedItemPeer.doSelect(criteria).get(0);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//retrieve using current price
	@SuppressWarnings("unchecked")
	public static List<StockedItem> retrieveAllCurrentPrice(String query){
		Criteria criteria = new Criteria();
		criteria.add(StockedItemPeer.CURRENTPRICE, query);
		try{
			return (List<StockedItem>)StockedItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<StockedItem>();
		}
	}
	
	//retrieve using quantity
	@SuppressWarnings("unchecked")
	public static List<StockedItem> retrieveAllQuantity(String query){
		Criteria criteria = new Criteria();
		criteria.add(StockedItemPeer.QUANTITY, query);
		try{
			return (List<StockedItem>)StockedItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<StockedItem>();
		}
	}
	
	//retrieve using item_id
	@SuppressWarnings("unchecked")
	public static List<StockedItem> retrieveAllItemId(int query){
		Criteria criteria = new Criteria();
		criteria.add(StockedItemPeer.ITEMBATCHID, query);
		try{
			return (List<StockedItem>)StockedItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<StockedItem>();
		}
	}
	
	//update stocked item peer
	public static boolean updateStocked_Item(int stockedItemId, float currentPrice, int quantity, int itemBatchId){
		Criteria selectCriteria = new Criteria();
		selectCriteria.add(StockedItemPeer.STOCKEDITEMID, stockedItemId);
		
		Criteria criteria = new Criteria();
		criteria.add(StockedItemPeer.CURRENTPRICE, currentPrice);
		criteria.add(StockedItemPeer.QUANTITY, quantity);
		criteria.add(StockedItemPeer.ITEMBATCHID, itemBatchId);
		
		
		try{
			UserPeer.doUpdate(selectCriteria, criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
//	public static int getMinItemBatch(String brandName){
//			Criteria itemcriteria = new Criteria();	
		//		itemcriteria.add(ItemBatchPeer.ITEMID, ItemPeer.ITEMID);
//		itemcriteria.addSelectColumn("MIN(" + ItemBatchPeer.BATCHNO +")");	
//			
//		itemcriteria.add(ItemPeer.BRANDNAME,brandName);
//		itemcriteria.add(ItemBatchPeer.ITEMID, ItemPeer.ITEMID);
//		itemcriteria.addSelectColumn("MIN(" + ItemBatchPeer.BATCHNO +")");
//		
//		Criteria.Criterion c = itemcriteria.getNewCriterion(StockedItemPeer.QUANTITY, 0, Criteria.GREATER_THAN);
//		itemcriteria.add(c);
//		
//		try{
//			List result = (List<User>)StockedItemPeer.doSelectVillageRecords(itemcriteria);
//			Record record = (Record)result.get(0);
//			return record.getValue(1).asInt();
//		}catch(Exception e){
//			e.printStackTrace();
//			return -1;
//		}
		

//		Item selectedItem = null;
//		try {
//			selectedItem = (Item)ItemPeer.doSelect(itemcriteria).get(0);
//		} catch (TorqueException e) {
//			e.printStackTrace();
//		}
//		
//
//		//int itemId = selectedItem.getItem_Id();
//		
//				
//		//Criteria.Criterion c = itembatchCriteria.getNewCriterion(Stocked_ItemPeer.QUANTITY, 0, Criteria.GREATER_THAN);
//		
//		Criteria itembatchCriteria = new Criteria();
//		itembatchCriteria.add(Item_BatchPeer.ITEM_ID,itemId);
//		itembatchCriteria.add(Stocked_ItemPeer.QUANTITY, 0, Criteria.GREATER_THAN);
//		itembatchCriteria.addSelectColumn("MIN(" + Item_BatchPeer.BATCH_NO +")");
//		
//		try{
//			List result = (List<User>)Stocked_ItemPeer.doSelectVillageRecords(itembatchCriteria);
//			Record record = (Record)result.get(0);
//			return record.getValue(1).asInt();
//		}catch(Exception e){
//			e.printStackTrace();
//			return -1;
//		}
//	
//	}
	
}
