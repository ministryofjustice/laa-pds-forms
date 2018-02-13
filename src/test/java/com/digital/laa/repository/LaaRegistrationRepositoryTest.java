package com.digital.laa.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.digital.laa.model.Registration;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class LaaRegistrationRepositoryTest {
	
	@Autowired
	private LAARegistrationRepository laaRegistrationRepository;

	@Test
	public void testPersist_Registration_IdReturned() {
	
		Registration registration = new Registration();
		registration.setTitle("Mr");
		registration.setSurname("testsurname");
		registration.setForename("testforename");
	
		Registration persistedRegistration = laaRegistrationRepository.save(registration);
		
		List<Registration> registrations = laaRegistrationRepository.findAll();

		
		assertNotNull(persistedRegistration.getId());
		assertTrue(persistedRegistration.getId() > 0);
	}
	
}
