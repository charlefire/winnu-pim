package winnu.test;

import winnu.dao.UserPeer;

public class UserPeerTest {


	public static void main(String[] args) {

		InitTorque it = new InitTorque();
		it.init();
		
		
		//UserPeer.createUser("winnu_username", "winnu_pass", "winnu_fullname", "winnu_position", "winnu_address", 12345, "Admin");
		//UserPeer.createUser("reg_username", "reg_pass", "reg_name", "regular_lang", "reg_add", 54321, "Regular");
		//SupplierPeer.createSupplier("supplier_name", "supplier_add", 12345);
		//ItemPeer.createItem("winnu", "winnu pim", "junior", "typist", 10, 1);

		//DoctorPeer.addDoctor("Benj", "12345", "54322");
		UserPeer.deleteUser("yasah");
	}

}
