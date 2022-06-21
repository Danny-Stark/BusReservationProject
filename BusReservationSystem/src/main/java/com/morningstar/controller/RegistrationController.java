package com.morningstar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.morningstar.model.Person;
import com.morningstar.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	
	@GetMapping(path = "addPersonForm.view")
	public String showPersonForm() {
		return "addPerson";
	}

	@PostMapping(path = "addPerson.do")
	public String addPerson(Person p) {
		int result = service.addPerson(p);
		if (result>=1)
			return "index";
		else
			return "error";
	}

	@GetMapping(path = "loginForm.view")
	public String showLoginForm() {
		return "login";
	}

	@PostMapping(path = "login.do")
	public String loign(Person p) {
		int result = service.checkUserInfo(p.getEmailId(),p.getPassword());
		System.out.println(result);
		if (result>=1)
			return "index";
		else
			return "error";
	}
}
