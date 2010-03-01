package winnu.control;

import winnu.dao.Item;


public class AddItemToSaleController {
	WinnuControl control;
	
    public AddItemToSaleController(WinnuControl control){
    	this.control = control;
    }

    public boolean addItemToSale(Item item, int quantity){
    	control.saleController.addItem(item, quantity);    	
        return true;
    }
}
