package com.schedule.scratch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ScratchController {
	/*
	 * Basic controller for testing how your jsps looks
	 * Make sure the mapping has prefix /scratch/
	 * And return the jsp which you want to see
	 */
	
	@RequestMapping (value = "/scratch/login", method = RequestMethod.GET)
	public String displayLoginPage()
	{
		return "login";
	}
	@RequestMapping (value = "/scratch/login", method = RequestMethod.POST)
	public String handleLogin(ModelMap model, @RequestParam String username, @RequestParam String password) {
		if(username.equals("sam") && password.equals("awesome")) {
			model.put("name", username);
			return "index";
		}
		return "login";
	}
}
