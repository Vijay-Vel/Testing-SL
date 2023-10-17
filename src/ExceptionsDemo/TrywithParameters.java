package ExceptionsDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TrywithParameters {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try(PrintWriter writer = new  PrintWriter(new File("/home/vvijaymphasis/Downloads//test.txt"))) {
			
			writer.println("hello All");
			
		}
		catch(ArithmeticException e){
		   System.out.println(e.getMessage());
		   System.out.println("No fiel found");
		}
			

	}

}
