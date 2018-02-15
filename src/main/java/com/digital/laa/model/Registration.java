package com.digital.laa.model;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;


@Entity
@SequenceGenerator(name = "registrationSeq", sequenceName = "registration_id_seq", allocationSize = 1)
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "registrationSeq")
	private Integer id;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	private String surname;
	@NotEmpty
	private String forename;
	
	private LocalDate dob;

	private Integer age;
	
	private String niNo;
	
	@OneToOne( cascade=CascadeType.ALL)
	private Address address;
	
	private String employmentStatus;

	private String relationshipStatus;
	
	private String telephoneNumber;
	
	@OneToOne( cascade=CascadeType.ALL)
	private Address correspondenceAddress;
	
	private Boolean existingClient;
	
	private Boolean requestSpecificSolicity;
	
	private String disability;
	
	private String nationality;
	
	private String policeStation;
	
	private String allegation;
	
	private Boolean previousConviction;
	
	private String venue;
	
	private String funding;
	
	private Boolean conflictCheck;
	
	private Boolean riskAssesment;
	
	private String name;
	
	private LocalDate date;
	
	
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNiNo() {
		return niNo;
	}

	public void setNiNo(String niNo) {
		this.niNo = niNo;
	}


	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}


	public Boolean getExistingClient() {
		return existingClient;
	}

	public void setExistingClient(Boolean existingClient) {
		this.existingClient = existingClient;
	}

	public Boolean getRequestSpecificSolicity() {
		return requestSpecificSolicity;
	}

	public void setRequestSpecificSolicity(Boolean requestSpecificSolicity) {
		this.requestSpecificSolicity = requestSpecificSolicity;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPoliceStation() {
		return policeStation;
	}

	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	public String getAllegation() {
		return allegation;
	}

	public void setAllegation(String allegation) {
		this.allegation = allegation;
	}

	public Boolean getPreviousConviction() {
		return previousConviction;
	}

	public void setPreviousConviction(Boolean previousConviction) {
		this.previousConviction = previousConviction;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getFunding() {
		return funding;
	}

	public void setFunding(String funding) {
		this.funding = funding;
	}

	public Boolean getConflictCheck() {
		return conflictCheck;
	}

	public void setConflictCheck(Boolean conflictCheck) {
		this.conflictCheck = conflictCheck;
	}

	public Boolean getRiskAssesment() {
		return riskAssesment;
	}

	public void setRiskAssesment(Boolean riskAssesment) {
		this.riskAssesment = riskAssesment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(Address correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	


	

}
