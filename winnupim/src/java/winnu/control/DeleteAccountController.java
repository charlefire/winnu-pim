package winnu.control;

import java.util.List;

import winnu.dao.User;
import winnu.dao.UserPeer;

public class DeleteAccountController {
    public DeleteAccountController(){
    }

    public boolean deleteAccount(String username){
		UserPeer.deleteUser(username);
        return true;
    }
    
    
	public static List<User> retrieveUsers(){		
		return (List<User>)UserPeer.retrieveAllUsers();
	}	
}
