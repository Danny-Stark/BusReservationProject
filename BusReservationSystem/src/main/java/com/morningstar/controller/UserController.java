package com.morningstar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.morningstar.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	// User Dashboard
	@GetMapping(path = "userDashboard.do")
	public String userDashboard() {
		return "userDashboard";
	}

}
