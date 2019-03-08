package usecases.register;

public class RegisterViewImpl implements RegisterView {

	@Override
	public void display() {
		System.out.println("display");
	}

	@Override
	public void displaySuccess() {
		System.out.println("success");
	}

	@Override
	public void displayEmailShouldNotBeEmpty() {
		System.out.println("email is empty");
	}

	@Override
	public void displayNameShouldNotBeEmpty() {
		System.out.println("name is empty");
	}

	@Override
	public void displayPasswordShouldNotBeEmpty() {
		System.out.println("password is empty");	
	}
	
}
