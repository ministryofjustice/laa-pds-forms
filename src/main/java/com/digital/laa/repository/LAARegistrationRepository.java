package com.digital.laa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digital.laa.model.Registration;


public interface LAARegistrationRepository extends JpaRepository<Registration, Integer> {

	

}
