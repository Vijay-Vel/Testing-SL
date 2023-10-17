package ExceptionsDemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=9;
		int j=0;
		
		try {
			System.out.println("result:"+i/j);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Don't give 0 in j");

		}
		System.out.println("exception");
		System.out.println("Addition result:"+(i+j));
		System.out.println("Subraction result:"+(i-j));
		System.out.println("Multiplication result:"+(i*j));

}
}