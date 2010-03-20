package winnu.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import com.workingdogs.village.DataSetException;
import com.workingdogs.village.Record;

@SuppressWarnings("serial")
public class SupplierPeer extends winnu.dao.BaseSupplierPeer {
	
	//add supplier
	public static boolean addSupplier(String supplierName, String address, String contactNo){
		Criteria criteria = new Criteria();
		criteria.add(SupplierPeer.SUPPLIERNAME, supplierName);
		criteria.add(SupplierPeer.ADDRESS, address);
		criteria.add(SupplierPeer.CONTACTNO, contactNo);
		//criteria.add(UserPeer.ACTIVE, false);
		try{
			SupplierPeer.doInsert(criteria);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	//retrieve supplier
	public static Supplier retrieveSupplier(String id){
		Criteria criteria = new Criteria();
		criteria.add(SupplierPeer.SUPPLIERID, id);
		try{
			return (Supplier)SupplierPeer.doSelect(criteria).get(0);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	//retrieve using supplier name
	@SuppressWarnings("unchecked")
	public static List<Supplier> retrieveAllName(String query){
		Criteria criteria = new Criteria();
		criteria.add(SupplierPeer.SUPPLIERNAME, query);
		try{
			return (List<Supplier>)SupplierPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Supplier>();
		}
	}
	
	//retrieve using address
	@SuppressWarnings("unchecked")
	public static List<Supplier> retrieveAllAddress(String query){
		Criteria criteria = new Criteria();
		criteria.add(SupplierPeer.ADDRESS, query);
		try{
			return (List<Supplier>)SupplierPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Supplier>();
		}
	}
	
	//retrieve using contact no
	@SuppressWarnings("unchecked")
	public static List<Supplier> retrieveAllContactNo(String query){
		Criteria criteria = new Criteria();
		criteria.add(SupplierPeer.CONTACTNO, query);
		try{
			return (List<Supplier>)SupplierPeer.doSelect(criteria);
		}catch(Exception e){
			e.printStackTrace();
			return new ArrayList<Supplier>();
		}
	}
	
	//check if existing
	public static boolean isExisting(String supplierName){
		Criteria criteria = new Criteria();
		criteria.add(SupplierPeer.SUPPLIERNAME, supplierName);
		
		try{
			SupplierPeer.doSelect(criteria).get(0);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static int getMaxSupplierId(){
		Criteria maximum = new Criteria();
		maximum.addSelectColumn("MAX(" + SupplierPeer.SUPPLIERID +")");
		
		try {
			List result = (List<User>)SupplierPeer.doSelectVillageRecords(maximum);
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
