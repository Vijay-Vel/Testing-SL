package javaprograms;

public class MethodsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hi hello";
		String s2="world";
		System.out.println("concat using inbuilt-method: " +s1.concat(s2));
		if(s1.contains("hi"))
			System.out.println("test case passed");
		else
			System.out.println("test case failed");
		if(s2.equals("world"))
			System.out.println("passed");
		else
			System.out.println("failed");
		String s3= "practice labs java";
		String s4= s3.substring(14);
		if(s4.equals("java"))
			System.out.println("test case passed");
		else
			System.out.println("test case failed");
	}

}
