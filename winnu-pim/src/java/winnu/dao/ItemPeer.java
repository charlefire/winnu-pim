package winnu.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import com.workingdogs.village.DataSetException;
import com.workingdogs.village.Record;

@SuppressWarnings("serial")
public class ItemPeer extends winnu.dao.BaseItemPeer {
	
	public static boolean addItem(String genericName, String brandName, String classification, String type, int minimumSupplyLimit, int userId){
		Criteria criteria = new Criteria();
		criteria.add(ItemPeer.GENERICNAME, genericName);
		criteria.add(ItemPeer.BRANDNAME, brandName);
		criteria.add(ItemPeer.CLASSIFICATION, classification);
		criteria.add(ItemPeer.TYPE, type);
		criteria.add(ItemPeer.MINIMUMSUPPYLIMIT, minimumSupplyLimit);
		criteria.add(ItemPeer.NEXTBATCH, 0);
		criteria.add(ItemPeer.USERID, userId);
		
		
		try{
			ItemPeer.doInsert(criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	

	//retrieve item using id
	public static Item retrieveItem(String id){
		Criteria criteria = new Criteria();
		criteria.add(ItemPeer.ITEMID, id);
		try{
			return (Item)ItemPeer.doSelect(criteria).get(0);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//retrieve using generic name
	@SuppressWarnings("unchecked")
	public static List<Item> retrieveAllGenericName(String query){
		Criteria criteria = new Criteria();
		criteria.add(ItemPeer.GENERICNAME, query);
		try{
			return (List<Item>)ItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Item>();
		}
	}
	
	//retrieve using brand name
	@SuppressWarnings("unchecked")
	public static List<Item> retrieveAllBrandName(String query){
		Criteria criteria = new Criteria();
		criteria.add(ItemPeer.BRANDNAME, query);
		try{
			return (List<Item>)ItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Item>();
		}
	}
	
	//retrieve using classification
	@SuppressWarnings("unchecked")
	public static List<Item> retrieveAllClassification(String query){
		Criteria criteria = new Criteria();
		criteria.add(ItemPeer.CLASSIFICATION, query);
		try{
			return (List<Item>)ItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Item>();
		}
	}
	
	//retrieve using type
	@SuppressWarnings("unchecked")
	public static List<Item> retrieveAllType(String query){
		Criteria criteria = new Criteria();
		criteria.add(ItemPeer.TYPE, query);
		try{
			return (List<Item>)ItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Item>();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Item> retrieveAllItems(){
		Criteria criteria = new Criteria();
		try{
			return (List<Item>)ItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Item>();
		}
	}
	
	//retrieve using minimum supply limit
	@SuppressWarnings("unchecked")
	public static List<Item> retrieveAllMinimumSupplyLimit(String query){
		Criteria criteria = new Criteria();
		criteria.add(ItemPeer.MINIMUMSUPPYLIMIT, query);
		try{
			return (List<Item>)ItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Item>();
		}
	}
	
	//retrieve using user id
	@SuppressWarnings("unchecked")
	public static List<Item> retrieveAllUserId(String query){
		Criteria criteria = new Criteria();
		criteria.add(ItemPeer.USERID, query);
		try{
			return (List<Item>)ItemPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Item>();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static int getMaxItemId(){
		
		Criteria maximum = new Criteria();
		maximum.addSelectColumn("MAX(" + ItemPeer.ITEMID +")");
		
		try {
			List result = (List<User>)ItemPeer.doSelectVillageRecords(maximum);
			Record record = (Record)result.get(0);
			return record.getValue(1).asInt();
			
		} catch (TorqueException e1) {
			e1.printStackTrace();
		} catch (DataSetException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public static int getNextBatchToDispose(String brandname){
		Criteria criteria = new Criteria();
		criteria.add(ItemPeer.BRANDNAME, brandname);
		try{
			Item result = (Item)ItemPeer.doSelect(criteria).get(0);
			return result.getNextBatch();
		}catch(Exception e){
			e.printStackTrace();
			return -1;
		}	
	}
	
	@SuppressWarnings("unchecked")
	public static int getTotalQuantity(String brandName){
		Item query;
		List<ItemBatch> itemBatchQuery;
		List<StockedItem> stockedItemQuery;
		
		Integer count = 0;
		try{
			query = (Item)retrieveAllBrandName(brandName).get(0);
			int itemid = query.getItemId();
			
			Criteria criteria= new Criteria();
			criteria.add(ItemBatchPeer.ITEMID, itemid);
			itemBatchQuery = (List<ItemBatch>)ItemBatchPeer.doSelect(criteria);
			
			for (int i=0;i<itemBatchQuery.size();i++){
				Criteria criteria2 = new Criteria();
				criteria2.add(StockedItemPeer.ITEMBATCHID,itemBatchQuery.get(i).getItemBatchId());
				stockedItemQuery = (List<StockedItem>)StockedItemPeer.doSelect(criteria2);
				
				count += stockedItemQuery.get(0).getQuantity();				
			}
			return count;
			
//			for(int i=0; i<query.size(); i++){
//				Criteria criteria = new Criteria();
//				
//				criteria.add(ItemPeer.BRANDNAME, "gname");
//				criteria.add(ItemBatchPeer.ITEMID, 1);
//							
//				
//				criteria.addSelectColumn("SUM(" +StockedItemPeer.QUANTITY +")");
//				
//				List result = (List<Item>)StockedItemPeer.doSelectVillageRecords(criteria);
//				Record record = (Record)result.get(0);
//				return record.getValue(1).asInt();
//			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("dito pumasok");
			return count;
			
			
		}
	}
}
