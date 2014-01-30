package com.macoloc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The login controller.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value = "/", method=RequestMethod.POST) 
	public String loginAttempt(final Model model) {
		return null;
	}
}
