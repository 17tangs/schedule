package com.schedule.general;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GeneralController {
	// For now this is where most mapping will belong
	

	// --------- mappings    -------

	@RequestMapping (value = "/index", method = RequestMethod.GET)
	public String login(ModelMap model)
	{
		model.put("name", getLoggedInUserName());
		return "index";
	}

	// -------------------------------

	private String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();
		
		
		return principal.toString();
	}

}
