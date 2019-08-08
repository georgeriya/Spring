package com.training.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

public class DoctorController {

	@GetMapping("/addDoctor")
	public String initForm() {
		return null;
	}
	
	@PostMapping
	public ModelAndView onSubmit() {
		return null;
	}
}
