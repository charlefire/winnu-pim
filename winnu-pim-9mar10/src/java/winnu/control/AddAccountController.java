package winnu.control;

import winnu.dao.UserPeer;

public class AddAccountController {

    public AddAccountController(){        
    }

    public boolean addUser(String lastname, String middlename, String firstname, String address, String position, String username, String usertype, String contactnumber, String password){

    	UserPeer.addUser(username, password, lastname, middlename, firstname, position, address, contactnumber, usertype, 0);
		//System.out.println(fullname + " --- " + address + " --- " + position +  " --- " + username + " --- " + usertype  + " --- " + contactnumber);
    	return true;
        
     }
	 
	 	
	public boolean isExisting(String username){
		if(!(UserPeer.retrieveAllUsername(username).size() == 0)){
    		return false;
    		
    	}
    	else{
    		return true;
    		
    	}
    	
    }
}
