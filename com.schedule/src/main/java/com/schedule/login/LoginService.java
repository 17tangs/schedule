package com.schedule.login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		if((user.equalsIgnoreCase("sam") && password.equals("awesome")) ||
		   (user.equalsIgnoreCase("sabin") && password.equals("Infinity01"))) {
			return true;
		}
		return false;
		
	}

}