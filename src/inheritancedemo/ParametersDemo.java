package inheritancedemo;

public class ParametersDemo {
	public void login(String username,String password)
	{
		System.out.println("Enter Username: " + username);
		System.out.println("Enter Password: " + password);
		System.out.println("Sign into mailbox");
	}
	
	public void ComposeEmail(String text)
	{
		System.out.println("Compose an Email with text as: " + text);
	}
	
	public void logut()
	{
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametersDemo obj = new ParametersDemo();
		
		// call the method created in the class and pass the input values
				
				// objname.methodname();
				
			obj.login("Sonal", "admin@123");
			obj.ComposeEmail("Hello ALL");
			obj.login("admin", "admin");
			obj.logut();

	}

}
