package mvcWebAppService;

import java.util.HashMap;
import model.User;

public class LoginService {	
	HashMap<String, String> users= new HashMap<>();
	public LoginService(){
		users.put("Pranay", "Pranay Kalva");
		users.put("Ajay", "Ajay Dasari");
	}
	public Boolean authenticate(String userName, String password){
		if(password==null || password ==""){
			return false;
		}
		return true;
	}
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserId(userId);
		user.setUserName(users.get(userId));
		return user;
	}
}
