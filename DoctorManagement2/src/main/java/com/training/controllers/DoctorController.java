package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.models.Doctor;

@Controller
public class DoctorController {
	@Autowired
	private Doctor doctor;
	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping("/addDoctor")
	public ModelAndView initForm() {
		mdlView.setViewName("addDoctor");
		mdlView.addObject("command", doctor);
		
		return mdlView;
	}
	
	@ModelAttribute("depts")
	public String[] departments() {
		return new String[] {"ENT","Dental","Eye","Skin"};
	}
	
	@PostMapping("/addDoctor")
	public String onSubmit(@ModelAttribute("data") Doctor doctor) {
		return "success";
	}
	
	
	
}
