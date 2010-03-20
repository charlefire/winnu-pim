package winnu.control;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import winnu.dao.Item;

public class OverrideSaleController {
	public List<Item> itemList = null;
	private WinnuControl control;
	
	public OverrideSaleController(WinnuControl control) {
		this.control = control;
	}
	
	public boolean isValid(JTextField txtUsername, JTextField txtPassword) {
		if(txtPassword.getText().equals("") || txtUsername.getText().equals("")) {
    		return false;
    	}
    	else {
    		return true;
    	}
	}
	
	public boolean authenticateUser(String username, String password) {
		if(this.control.loginController.authenticateUser(username, password)) {
			return true;
		}
		
		return false;
	}
	
	public boolean displaySaleInfo(String item) {
		if(JOptionPane.showConfirmDialog(null, "Confirm removal of " + item + "?", null, javax.swing.JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			return true;
		
		return false;
	}
	
	public void displaySuccessMessage(String item) {
		JOptionPane.showMessageDialog(null, item +  " has been successfully removed.", "Override Sale", 1);
	}
	
	public void overrideSale(int i) {
		control.saleController.itemList.remove(i);
	}
}
