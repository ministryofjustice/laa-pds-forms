package com.digital.laa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digital.laa.model.Registration;

@RestController
public class RegistrationController {
	
	
	@PostMapping(value="/register")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Registration register(Registration registration) {
		
		return new Registration();
	}

}
