package usecases.register;

import usecases.register.Register.RegisterResponse;

public class RegisterPresenter implements RegisterResponse {

	private RegisterView view;
	
	public RegisterPresenter(RegisterView view) {
		this.view = view;
	}
	
	@Override
	public void onSuccess() {
		view.displaySuccess();
	}

	@Override
	public void onEmailShouldNotBeEmpty() {
		view.displayEmailShouldNotBeEmpty();
	}

	@Override
	public void onNameShouldNotBeEmpty() {
		view.displayNameShouldNotBeEmpty();
	}

	@Override
	public void onPasswordShouldNotBeEmpty() {
		view.displayPasswordShouldNotBeEmpty();
	}

}
