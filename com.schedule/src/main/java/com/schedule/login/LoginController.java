package com.schedule.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping (value = "/login", method = RequestMethod.GET)
	public String showlogin()
	{
		return "login";
	}
	
	@RequestMapping (value = "/login", method = RequestMethod.POST)
	public String HandleLogin(@RequestParam String username, @RequestParam String password, ModelMap model) {
		if(!service.validateUser(username, password)) {
			model.put("errorMessage", "Invalid Credentials!!");
			return "login";
		}
		model.put("name", username);
		return "index";
	}

	@RequestMapping (value = "/hello")
	public String showhello()
	{
		return "hello";
	}

	@RequestMapping (value = "/index")
	public String showschedule()
	{
		return "index";
	}

}
