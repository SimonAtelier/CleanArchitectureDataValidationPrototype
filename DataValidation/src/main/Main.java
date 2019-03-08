package main;

import usecases.register.Register;
import usecases.register.Register.RegisterRequest;
import usecases.register.Register.RegisterResponse;
import usecases.register.RegisterPresenter;
import usecases.register.RegisterRequestModel;
import usecases.register.RegisterUseCase;
import usecases.register.RegisterView;
import usecases.register.RegisterViewImpl;

public class Main {

	public static void main(String[] args) {
		RegisterView view = new RegisterViewImpl();
		Register useCase = new RegisterUseCase();
		RegisterResponse response = new RegisterPresenter(view);
		RegisterRequest request = createRequest();
		view.display();
		useCase.execute(request, response);
	}
	
	public static RegisterRequest createRequest() {
		RegisterRequestModel request = new RegisterRequestModel();
		request.setName("name");
		return request;
	}

}
