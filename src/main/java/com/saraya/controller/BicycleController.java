package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.BicycleService;

@Controller
public class BicycleController {
	@Autowired
	BicycleService bs;
	@RequestMapping(value="/list-bicycle", method=RequestMethod.GET)
	public String showList(ModelMap model) {
	  model.addAttribute("bicycles", bs.getAllBicycles());
		return "bicycleList";
	}
	
	@RequestMapping(value="/add-bicycle", method=RequestMethod.GET)
	public String addBicycleForm() {
	  
		return "addBicycle";
	}
	
	@RequestMapping(value="/add-bicycle", method=RequestMethod.POST)
	public String carAdded(ModelMap model, @RequestParam int year,
			@RequestParam String make, @RequestParam String mode,
			@RequestParam String picture) {
	  bs.addBicycle(year, make, mode, picture);
		return "redirect:/list-bicycle";
	}
	
	@RequestMapping(value="/delete-bicycle", method=RequestMethod.GET)
	public String DeleteList(ModelMap model, 
			@RequestParam int id) {
	  bs.removeBicycle(id);
	  model.clear();
		return "redirect:/list-bicycle";
	}
	
	
}