package ExceptionsDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = scan.nextInt();
		System.out.println("enter another number");
		int num2 = scan.nextInt();
		scan.close();
		
		int result = num1/num2;
		
		System.out.println("Division of two number:"+result);
		
		}
		catch(ArithmeticException e) {
			
			System.out.println("please don't give num2 as 0");
		
		}
		catch(InputMismatchException e) {
			System.out.println("please enter only integer value");
		}
		catch(Exception e) {
			System.out.println("please enter valid input");
		}
		
	}
}
