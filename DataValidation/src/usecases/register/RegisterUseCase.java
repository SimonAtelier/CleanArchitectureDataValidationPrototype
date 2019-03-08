package usecases.register;

import usecases.register.validation.EmailShouldNotBeEmptyRule;
import usecases.register.validation.NameShouldNotBeEmptyRule;
import usecases.register.validation.PasswordShouldNotBeEmptyRule;
import usecases.register.validation.RegisterValidator;

public class RegisterUseCase implements Register {

	private RegisterRequest request;
	private RegisterResponse response;
	private RegisterValidator validator;
	
	@Override
	public void execute(RegisterRequest request, RegisterResponse response) {
		setRequest(request);
		setResponse(response);
		initializeValidator();
		injectValidationRules();
		validateRequest();
		
		if (requestIsInvalid())
			return;
		
		registerNewUser();
		sendSuccess();
	}
	
	private void registerNewUser() {
		// TODO implement
	}
	
	private void sendSuccess() {
		getResponse().onSuccess();
	}
	
	private void initializeValidator() {
		validator = new RegisterValidator();
		validator.setRequest(getRequest());
		validator.setResponse(getResponse());
	}
	
	private void injectValidationRules() {
		validator.add(new EmailShouldNotBeEmptyRule());
		validator.add(new NameShouldNotBeEmptyRule());
		validator.add(new PasswordShouldNotBeEmptyRule());
	}
	
	private void validateRequest() {
		validator.validate();
	}
	
	private boolean requestIsInvalid() {
		return validator.isInvalid();
	}
	
	private RegisterRequest getRequest() {
		return request;
	}

	private void setRequest(RegisterRequest request) {
		this.request = request;
	}
	
	private RegisterResponse getResponse() {
		return response;
	}

	private void setResponse(RegisterResponse response) {
		this.response = response;
	}

}
