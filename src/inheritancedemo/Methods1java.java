package inheritancedemo;

public class Methods1java {
	public void login()
	{
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("Sign into mailbox");
	}
	
	public void ComposeEmail()
	{
		System.out.println("Compose an Email");
	}
	
	public void logut()
	{
		System.out.println("Click on logout button");
	}


	public static void main(String[] args) {
		Methods1java obj = new Methods1java();
		
		// call the method created in the class
				
				// objname.methodname();
				
				obj.login();
				
				obj.ComposeEmail();
				
				obj.logut();
		
		
	}

}
