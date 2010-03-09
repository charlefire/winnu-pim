package winnu.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import com.workingdogs.village.DataSetException;
import com.workingdogs.village.Record;

@SuppressWarnings("serial")
public class SalePeer extends winnu.dao.BaseSalePeer {

	public static boolean addSale(String customerName, java.sql.Date saleDate, int totalCost, int userId){
		Criteria criteria = new Criteria();
		criteria.add(SalePeer.CUSTOMERNAME, customerName);
		criteria.add(SalePeer.SALEDATE, saleDate);
		criteria.add(SalePeer.TOTALCOST, totalCost);
		criteria.add(SalePeer.USERID, userId);
		
		try{
			SalePeer.doInsert(criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	

	//retrieve sale using id
	public static Sale retrieveSale(int id){
		Criteria criteria = new Criteria();
		criteria.add(SalePeer.SALEID, id);
		try{
			return (Sale)SalePeer.doSelect(criteria).get(0);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//retrieve using customers name
	@SuppressWarnings("unchecked")
	public static List<Sale> retrieveAllCustomersName(String query){
		Criteria criteria = new Criteria();
		criteria.add(SalePeer.CUSTOMERNAME, query);
		try{
			return (List<Sale>)SalePeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Sale>();
		}
	}
	
	//retrieve using sale date
	@SuppressWarnings("unchecked")
	public static List<Sale> retrieveAllSaleDate(String query){
		Criteria criteria = new Criteria();
		criteria.add(SalePeer.SALEDATE, query);
		try{
			return (List<Sale>)SalePeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Sale>();
		}
	}
	
	
	//retrieve using total cost
	@SuppressWarnings("unchecked")
	public static List<Sale> retrieveAllTotalCost(String query){
		Criteria criteria = new Criteria();
		criteria.add(SalePeer.TOTALCOST, query);
		try{
			return (List<Sale>)SalePeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Sale>();
		}
	}
	
	//retrieve using user id
	@SuppressWarnings("unchecked")
	public static List<Sale> retrieveAllUserId(String query){
		Criteria criteria = new Criteria();
		criteria.add(SalePeer.USERID, query);
		try{
			return (List<Sale>)SalePeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Sale>();
		}
	}
	
	//update sale
	public static boolean updateSale(int saleId, String customerName, String saleDate, int totalCost, int userId){
		Criteria selectCriteria = new Criteria();
		selectCriteria.add(SalePeer.SALEID, saleId);
		
		Criteria criteria = new Criteria();
		criteria.add(SalePeer.CUSTOMERNAME, customerName);
		criteria.add(SalePeer.SALEDATE, saleDate);
		criteria.add(SalePeer.TOTALCOST, totalCost);
		criteria.add(SalePeer.USERID, userId);		
		
		try{
			UserPeer.doUpdate(selectCriteria, criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static int getMaxSaleId(){
		Criteria maximum = new Criteria();
		maximum.addSelectColumn("MAX(" + SalePeer.SALEID +")");
		
		try {
			List result = (List<User>)SalePeer.doSelectVillageRecords(maximum);
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
