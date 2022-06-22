package com.morningstar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.morningstar.model.Bus;
import com.morningstar.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService service;

	@GetMapping(path = "addBusForm.view")
	public String showBusForm() {
		return "addBus";
	}

	@PostMapping(path = "addBus.do")
	public String addBus(Bus bus) {
		int result = service.addBus(bus);
		if (result >= 1)
			return "adminDashboard";
		else
			return "error";
	}

	// Delete record
	@GetMapping(path = "removeBus.view")
	public String removeBusById() {
		return "removeBus";
	}

	@PostMapping(path = "removeBus.do")
	public String removeBus(@RequestParam("bId") int id, Model model) {
		int result = service.removeBus(id);
		if (result >= 1) {
			return "adminDashboard";
		} else
			return "error";

	}

	// ************ view buses*************//
	@GetMapping(path = "viewBus.do")
	public String getAllBuses(Model model) {
		List<Bus> bus = service.getAllBuses();
		model.addAttribute("List", bus);
		return "viewBus";
	}
	
	// ************ Update bus by Id*************//
		@GetMapping(path = "updateBusById.view")
		public String updateBusById() {
			return "updateBus";
		}

		// Update record
		@PostMapping(path = "updateBusById.do")
		public String updateBusById(@RequestParam("bId") int id, Model model) {
			Bus bus = service.findBusById(id);
			model.addAttribute("busupdate", bus);
			System.out.println(bus);
			return "updateBusForm";

		}

		// Update record
		@PostMapping(path = "updateBus.do")
		public String updateBusById(Bus bus) {
			int id = bus.getbId();
			int result = service.updateBusById(bus, id);
			return "adminDashboard";

		}
	
	// Admin Dashboard
	@GetMapping(path = "adminDashboard.do")
	public String adminDashboard() {
		return "adminDashboard";
	}
	
	
}
