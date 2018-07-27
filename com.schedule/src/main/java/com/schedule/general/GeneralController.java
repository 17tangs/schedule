package com.schedule.general;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.schedule.entities.Schedule;
import com.schedule.service.IScheduleProvider;
import com.schedule.service.TestScheduleProvider;

@Controller
public class GeneralController {
	// For now this is where most mapping will belong
	
	IScheduleProvider scheduleProvider = new TestScheduleProvider();
	// --------- mappings    -------

	@RequestMapping (value = "/", method = RequestMethod.GET)
	public String login(ModelMap model)
	{
		Schedule s = scheduleProvider.getScheduleOfUser(getLoggedInUserName());
		System.out.println(s.toString());
		model.put("name", getLoggedInUserName());
		model.put("schedule",s);
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
