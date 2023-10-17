package inheritancedemo;

public class Base {
	public void openbrowser(String browser) {
		System.out.println("open the browser:" + browser);
		
	}
	public static void login(String username,String password)
	{
		System.out.println("Enter Username: " + username);
		System.out.println("Enter Password: " + password);
		System.out.println("Sign into mailbox");
	}
	public void logut()
	{
		System.out.println("Click on logout button");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
