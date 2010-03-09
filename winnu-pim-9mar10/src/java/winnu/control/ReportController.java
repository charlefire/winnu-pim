package winnu.control;

import java.util.List;

import winnu.dao.Item;
import winnu.dao.ItemPeer;

public class ReportController {

	public static boolean retrieveFromItem(){
		
		
		for(int i=0; i<ItemPeer.retrieveAllItems().size(); i++){
        	
        	System.out.println(ItemPeer.retrieveAllItems().get(i).getBrandName());
		}
		
		return true;
		
	}
	
}
