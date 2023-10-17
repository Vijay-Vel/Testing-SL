package inheritancedemo;

public class Payments extends Homepage {
	public void payments() {
		System.out.println("test payment page");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payments obj = new Payments();
		login("vijay", "vijay123");
		obj.Homepagetest();
		obj.payments();
		obj.logut();

	}

}
