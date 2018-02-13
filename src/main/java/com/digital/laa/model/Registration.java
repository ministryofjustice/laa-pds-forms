package com.digital.laa.model;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "registrationSeq", sequenceName = "registration_id_seq", allocationSize = 1)
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "registrationSeq")
	private Integer id;
	
	private String title;
	
	private String surname;

	private String forename;
	
	

	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setForename(String forename) {
		this.forename =  forename;
		
	}

	public String getForename() {
		return forename;
	}
	
	


	

}
