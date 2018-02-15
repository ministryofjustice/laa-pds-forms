package com.digital.laa.service;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.digital.laa.model.Registration;
import com.digital.laa.repository.LAARegistrationRepository;

@RunWith(MockitoJUnitRunner.class)
public class RegistrationServiceTest {

	@Mock
	private LAARegistrationRepository repository;
	
	@InjectMocks
	private RegistrationService registrationService;

	@Test
	public void test_CreateRegsitration_CreatedSuccessfully() {
		Registration registration  = new Registration();
		
		when(repository.save(registration)).thenReturn(registration);		

		registrationService.createRegistration(registration);
		
		verify(repository,times(1)).save(registration);			
	}

}
