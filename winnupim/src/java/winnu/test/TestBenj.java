package winnu.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.torque.TorqueException;

import winnu.dao.*;

@SuppressWarnings("unused")
public class TestBenj {
	
	public static void main(String[] args) {
//    	List<WithdrawnItem> withdrawnItems = new ArrayList<WithdrawnItem>();
//		WithdrawnItem ci;
//		Sale sale;
//		Item item;
//		ItemBatch itemBatch;
//				
//    	int itemId;
//    	int itemBatchId;
//    	int saleId;		
		
		InitTorque it = new InitTorque();
		it.init();
		
//		withdrawnItems = WithdrawnItemPeer.retrieveAllByItemBrandName("bname");		
//		withdrawnItems = WithdrawnItemPeer.retrieveAll();	
//		for(int i=0;i<withdrawnItems.size();i++){
//			ci = withdrawnItems.get(i);
//
//			try 
//				itemBatch = ci.getItemBatch();				
//				item = ci.getItemBatch().getItem();
//				
//				if((sale=ci.getSale())!=null){
//					System.out.println(sale.getSaleDate().toString() + " --- brand name: " + item.getBrandName() + " --- item batch: " + itemBatch.getBatchNo());				
//				}				
//	
//			} catch (TorqueException e) {
//				e.printStackTrace();
//			}										
//		}		
		
		java.util.Date today = new java.util.Date();
    	long t = today.getTime();
    	String dt = new java.sql.Date(t).toString().substring(8, 10);
    	
    	
    	System.out.println(dt);
    	
    	
	}

}
