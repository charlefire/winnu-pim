package winnu.control;

import java.util.List;

import winnu.dao.Item;
import winnu.dao.ItemPeer;

public class ItemSearchController {
	
    public ItemSearchController(){
    }

	public List<Item> searchUserByBrandName(String brandName){
		List <Item> searchResults = null;
		
		searchResults = (List<Item>)ItemPeer.retrieveAllBrandName(brandName);
        return searchResults;
    }

	public List<Item> searchUserByGenericName(String genericName){
		List <Item> searchResults = null;
		
		searchResults = (List<Item>)ItemPeer.retrieveAllGenericName(genericName);
        return searchResults;
    }
	
	public List<Item> searchItem(String item){
		List <Item> searchResults = null;
		List <Item> genericResults = null;
		
		
		if(item.equals("")){
			searchResults = (List<Item>)ItemPeer.retrieveAllItems();			
		}else{
			searchResults = searchUserByBrandName(item);
			genericResults = searchUserByGenericName(item);
			
			for(int i=0;i<genericResults.size();i++){
				if (!genericResults.get(i).getBrandName().equals(genericResults.get(i).getGenericName())){
					searchResults.add(genericResults.get(i));
				}			
			}
		}
		return searchResults;		
	}
	
    public boolean selectItem(){
        return true;
    }

    public boolean setSelectedItem(){
        return true;
    }
}
