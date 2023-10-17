package collections1;

import java.util.ArrayList;

public class Arratlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities  = new ArrayList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add(2,"New Delhi");
		cities.add("Mumbai");
		
		System.out.println(cities.size());
		
		for (String t: cities) 
		{
			System.out.println(t);
		}
	}

}
