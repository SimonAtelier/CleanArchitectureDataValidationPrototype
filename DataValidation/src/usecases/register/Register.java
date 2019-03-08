package usecases.register;

public interface Register {

	void execute(RegisterRequest request, RegisterResponse response);
	
	public interface RegisterRequest {
		
		String getName();
		
		String getEmail();
		
		String getPassword();
		
	}
	
	public interface RegisterResponse {
				
		void onSuccess();
		
		void onEmailShouldNotBeEmpty();
		
		void onNameShouldNotBeEmpty();
		
		void onPasswordShouldNotBeEmpty();
		
	}
	
}
