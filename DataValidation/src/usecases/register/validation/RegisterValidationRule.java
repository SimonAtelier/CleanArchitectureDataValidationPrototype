package usecases.register.validation;

import usecases.register.Register.RegisterRequest;
import usecases.register.Register.RegisterResponse;

public interface RegisterValidationRule {

	boolean validate(RegisterRequest request, RegisterResponse response);
	
}
