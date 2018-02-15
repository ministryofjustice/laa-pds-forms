package com.digital.laa.controller;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponse {

	private List<FieldError> fieldErrors = new ArrayList<>();

	private List<GlobalErrors> globalErrors = new ArrayList<>();



	public void addFieldErrors(List<FieldError> fieldErrors) {
		
			this.fieldErrors = fieldErrors;
	}

	public List<FieldError> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(List<FieldError> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

	public List<GlobalErrors> getGlobalErrors() {
		return globalErrors;
	}

	public void setGlobalErrors(List<GlobalErrors> globalErrors) {
		this.globalErrors = globalErrors;
	}

}
