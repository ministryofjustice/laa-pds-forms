package com.digital.laa.service;

import org.springframework.stereotype.Service;

import com.digital.laa.model.Registration;
import com.digital.laa.repository.LAARegistrationRepository;

@Service
public class RegistrationService {

	private LAARegistrationRepository registrationRepository;
	
	public RegistrationService(LAARegistrationRepository registrationRepository){
		this.registrationRepository = registrationRepository;
	}
	
	public Registration createRegistration(Registration registration) {
		return registrationRepository.save(registration);
	}

}
