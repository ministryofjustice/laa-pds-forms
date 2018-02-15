package com.digital.laa.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.digital.laa.model.Registration;

@RestController
public class RegistrationController {

	@PostMapping(value = "/register")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Registration register(@Valid @RequestBody Registration registration) {

		return new Registration();
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ErrorResponse validationErrors(MethodArgumentNotValidException e) {
		List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors().stream()
				.map(err -> new FieldError(err.getField(), err.getDefaultMessage())).collect(Collectors.toList());

		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.addFieldErrors(fieldErrors);

		return errorResponse;
	}

}
