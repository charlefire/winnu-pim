package winnu.control;

import java.util.List;

import winnu.dao.User;
import winnu.dao.UserPeer;


public class UserSearchController {
    public UserSearchController(){
    }

	public List<User> searchUser(){
        List <User> searchResults = null;
		
		searchResults = (List<User>)UserPeer.retrieveAllUsers();

        return searchResults;
    }
    
	
    public boolean selectUser(){
        return true;
    }

    public boolean setSelectedUser(){
        return true;
    }
}
