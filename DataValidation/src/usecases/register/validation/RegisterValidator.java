package usecases.register.validation;

import java.util.ArrayList;
import java.util.List;

import usecases.register.Register.RegisterRequest;
import usecases.register.Register.RegisterResponse;

public class RegisterValidator {

	private boolean invalid;
	private RegisterRequest request;
	private RegisterResponse response;
	private List<RegisterValidationRule> validationRules;
	
	public RegisterValidator() {
		validationRules = new ArrayList<RegisterValidationRule>();
	}
	
	public void add(RegisterValidationRule rule) {
		validationRules.add(rule);
	}
	
	public void validate() {
		setInvalid(false);
		for (RegisterValidationRule rule : validationRules) {
			if (!rule.validate(getRequest(), getResponse())) {
				setInvalid(true);
			}
		}
	}
	
	private void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}
	
	public boolean isInvalid() {
		return invalid;
	}

	public RegisterRequest getRequest() {
		return request;
	}

	public void setRequest(RegisterRequest request) {
		this.request = request;
	}

	public RegisterResponse getResponse() {
		return response;
	}

	public void setResponse(RegisterResponse response) {
		this.response = response;
	}
	
}
