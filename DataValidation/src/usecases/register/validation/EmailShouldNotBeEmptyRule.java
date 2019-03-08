package usecases.register.validation;

import usecases.register.Register.RegisterRequest;
import usecases.register.Register.RegisterResponse;

public class EmailShouldNotBeEmptyRule implements RegisterValidationRule {

	@Override
	public boolean validate(RegisterRequest request, RegisterResponse response) {
		if (request.getEmail() == null || request.getEmail().trim().equals("")) {
			response.onEmailShouldNotBeEmpty();
			return false;
		}
		return true;
	}
	
}
