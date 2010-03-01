package winnu.control;

import winnu.dao.User;
import winnu.dao.UserPeer;


public class LoginController {
	private WinnuControl control;
	
    public LoginController(WinnuControl control){
    	this.control = control;
    }

    public boolean login(String username, String password){
    	
    	User user = null;
    	
        if(!checkIfValid(username, password)) return false;
        
        try{
        	user = (User) UserPeer.retrieveAllUsername(username).get(0);
		}catch(Exception e){
        	return false;        	
        }
        
        if(comparePassword(user, password)){
    		control.setCurrentUser(user);  
    		return true;
        }  	
        return false;  
    }

    public void logout(){
    	control.setCurrentUser(null);
    }
    
    private boolean checkIfValid(String username, String password){
    	if(username=="" || password=="")return false;
        return true;
    }

    private boolean comparePassword(User user, String password){
    	if(user.getDeleted()==true)return false;
    	if(user.getPassword().equals(password)){  
    		return true;    
    	}else{
    		return false;
    	}
    }

}
