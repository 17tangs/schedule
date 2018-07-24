package com.schedule.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping (value = "/login")
	public String showlogin()
	{
		return "login";
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
