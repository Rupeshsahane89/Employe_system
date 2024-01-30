package com.example.demo.controller;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Employee;
import com.example.demo.service.Empservice;

@Controller
public class HomeController {
	
	@AutoConfigureOrder
	private Empservice empservice;
	
	@GetMapping("/")
	public String index(){
		
		return"index";
	}

	@GetMapping("/loadEmpSave")
	public String loadEmpSave(){
		
		return"emp_save";
	}
	
	@GetMapping("/EditEmp")
	public String EditEmp(){
		
		return"edit_emp";
	}
	
	

}
