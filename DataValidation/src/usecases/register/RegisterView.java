package usecases.register;

public interface RegisterView {

	void display();
	
	void displaySuccess();
	
	void displayEmailShouldNotBeEmpty();
	
	void displayNameShouldNotBeEmpty();
	
	void displayPasswordShouldNotBeEmpty();
	
}
