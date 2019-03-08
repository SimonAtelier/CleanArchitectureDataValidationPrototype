package usecases.register.validation;

import usecases.register.Register.RegisterRequest;
import usecases.register.Register.RegisterResponse;

public class NameShouldNotBeEmptyRule implements RegisterValidationRule {

	@Override
	public boolean validate(RegisterRequest request, RegisterResponse response) {
		if (request.getName() == null || request.getName().trim().equals("")) {
			response.onNameShouldNotBeEmpty();
			return false;
		}
		return true;
	}
	
}
