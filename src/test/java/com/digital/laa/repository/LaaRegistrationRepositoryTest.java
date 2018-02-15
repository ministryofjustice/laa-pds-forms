package com.digital.laa.repository;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.digital.laa.model.Address;
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
		registration.setDob(LocalDate.now().minusYears(20));
		registration.setAge(20);
		registration.setNiNo("NI000000A");
		
		Address address = new Address();
		address.setAddressLine1("12 Leaway");
		address.setPostcode("CCM129QP");
		
		registration.setAddress(address);
		registration.setEmploymentStatus("Test Employment Status");
		registration.setRelationshipStatus("Test Relationship Status");
		registration.setTelephoneNumber("1234567890");
		registration.setCorrespondenceAddress(address);
		registration.setExistingClient(false);
		registration.setRequestSpecificSolicity(false);
		registration.setDisability("Test Disability");
		registration.setNationality("Test Nationality");
		registration.setPoliceStation("Test Police Station");
		registration.setAllegation("Test Allegation");
		registration.setPreviousConviction(false);
		registration.setVenue("Test Venue");
		registration.setFunding("Test Funding");
		registration.setConflictCheck(false);
		registration.setRiskAssesment(false);
		registration.setName("Test Name");
		registration.setDate(LocalDate.now());
		
		
	
		Registration persistedRegistration = laaRegistrationRepository.save(registration);
		
		List<Registration> registrations = laaRegistrationRepository.findAll();

		
		assertNotNull(persistedRegistration.getId());
		assertTrue(persistedRegistration.getId() > 0);
	}
	
}
