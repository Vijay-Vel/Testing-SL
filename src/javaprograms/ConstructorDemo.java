package javaprograms;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("This is default constructor");
	}
	
	public ConstructorDemo(int a) {
		System.out.println("This is paramaterized constructor");
		System.out.println("The value of variable a is"+a);
	}
	
	public ConstructorDemo(int a, int b) {
		System.out.println("This is parameterized constructor");
		System.out.println("The value of variable a is"+a);
		System.out.println("The value of variable b is"+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj =new ConstructorDemo();
		ConstructorDemo obj1 =new ConstructorDemo(10);
		ConstructorDemo obj2=new ConstructorDemo(10,20);

	}

}
