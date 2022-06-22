package com.morningstar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.morningstar.model.Bus;
import com.morningstar.model.Customer;
import com.morningstar.service.RegistrationService;
import com.morningstar.service.UserService;

@Controller
public class RegistrationController {
	Customer cust=null;
	@Autowired
	private RegistrationService service;
	
	@Autowired
	private UserService services;
	
	@GetMapping(path = "addCustomerForm.view")
	public String showCustomerForm() {
		return "addCustomer";
	}

	@PostMapping(path = "addCustomer.do")
	public String addCustomer(Customer p) {
		int result = service.addCustomer(p);
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
	public String loign(Customer p) {
		cust = service.checkUserInfo(p.getEmailId(),p.getPassword());
		
		
		if (cust.getEmailId().equals("admin@gmail.com")&&cust.getPassword().equals("admin"))
			return "adminDashboard";
		else
			return "userDashboard";
		
	}
	
	
	//User
	// searchBusBySourceAndDest
		@GetMapping(path = "searchBusBySourceAndDest.view")
		public String searchBusBySourceAndDest() {
			return "searchBusBySourceAndDest";
		}

		@PostMapping(path = "searchBusBySourceAndDest.do")
		public String searchBySourceAndDest(@RequestParam("source,destination") String source,String destination, Model model)
		{
		
			System.out.println(source+destination);
			return "viewBus";
			

		}
		
	//View Customer Profile
		
		@GetMapping(path="viewCustomer.view")	
		public String getAllBuses(Model model) {
		model.addAttribute("Customer", cust);
		return "viewCustProfile";
	}
		// ************ view buses*************//
//		@GetMapping(path = "viewBus.do")
//		public String getAllBuses(Model model) {
//			List<Bus> bus = service.getAllBuses();
//			model.addAttribute("List", bus);
//			return "viewBus";
//		}
		
		// ************ Update bus by Id*************//
//			@GetMapping(path = "updateBusById.view")
//			public String updateBusById() {
//				return "updateBus";
//			}
//
//			// Update record
//			@PostMapping(path = "updateBusById.do")
//			public String updateBusById(@RequestParam("bId") int id, Model model) {
//				Bus bus = service.findBusById(id);
//				model.addAttribute("busupdate", bus);
//				System.out.println(bus);
//				return "updateBusForm";
//
//			}
//
//			// Update record
//			@PostMapping(path = "updateBus.do")
//			public String updateBusById(Bus bus) {
//				int id = bus.getbId();
//				int result = service.updateBusById(bus, id);
//				return "adminDashboard";
//
//			}
}
