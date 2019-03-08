package usecases.register.validation;

import usecases.register.Register.RegisterRequest;
import usecases.register.Register.RegisterResponse;

public class PasswordShouldNotBeEmptyRule implements RegisterValidationRule {

	@Override
	public boolean validate(RegisterRequest request, RegisterResponse response) {
		if (request.getPassword() == null || request.getPassword().trim().equals("")) {
			response.onPasswordShouldNotBeEmpty();
			return false;
		}
		return true;
	}
	
}
