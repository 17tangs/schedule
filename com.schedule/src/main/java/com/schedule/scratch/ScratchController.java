package com.schedule.scratch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ScratchController {
	/*
	 * Basic controller for testing how your jsps looks
	 * Make sure the mapping has prefix /scratch/
	 * And return the jsp which you want to see
	 */
	
	@RequestMapping (value = "/scratch/login", method = RequestMethod.GET)
	public String login()
	{
		return "login";
	}
}
