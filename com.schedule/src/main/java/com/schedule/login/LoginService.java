package com.schedule.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		if((user.equalsIgnoreCase("sam") && password.equals("awesome")) ||
		   (user.equalsIgnoreCase("sabin") && password.equals("Infinity01"))) {
			return true;
		}
		return false;
		
	}

}