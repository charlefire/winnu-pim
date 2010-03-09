/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package winnu.control;

import winnu.dao.UserPeer;


public class EditAccountController {
    public EditAccountController(){
    }

    public boolean editAccount(int user_id, String username, String password, String firstname, String middlename, String lastname, String position, String address, String contactno, String type){
    	UserPeer.updateUser(user_id, username, password, firstname, middlename, lastname, position, address, contactno, type);
        return true;
    }
}
