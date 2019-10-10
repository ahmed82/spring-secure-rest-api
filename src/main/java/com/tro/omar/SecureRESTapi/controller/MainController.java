package com.tro.omar.SecureRESTapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class MainController {

	
	@GetMapping("/students")
	public String getAllInvoices(){
		return "Hello Admin";
	}
	
	
	
}
