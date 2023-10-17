package ExceptionsDemo;

public class ThrowsDemo  {
	public void div(int a , int b) throws ArithmeticException
	{
	
	if (b==0)
	{
		throw new ArithmeticException();
	}
	else
	{
		int c = a/b;
		System.out.println("dividion of a by is:"+c);
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsDemo t = new ThrowsDemo();
		
		try {
			t.div(12, 0);
		}
		catch(Exception e){
			System.out.println("further code execution");
		}
		
	}

}
