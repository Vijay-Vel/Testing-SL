package inheritancedemo;

public class Methods2Demo {
	int x = 100;
	String str3 = "Java";
	
	public int sum()
	{
		int a =10;
		int b=20;
		int result = a+b+x;
		return result;  
		
	}
	
	public String concatmethod()
	{
		String str1 = "selenium";
		String str2 = " training";
		String result = str1+str2+" "+ str3;
		return result;
	}
	
	public void printmethod()
	{
		System.out.println("The global integer variable : " + x);
		System.out.println("The global String variable : " + str3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods2Demo obj = new Methods2Demo();
		
		System.out.println(obj.concatmethod());
		int value = obj.sum();
		
		System.out.println(value);
		
		
		obj.printmethod();


	}

}
