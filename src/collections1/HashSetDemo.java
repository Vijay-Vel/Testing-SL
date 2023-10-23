package collections1;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> cities = new HashSet<>();
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Moscow");
		cities.add("Mumbai");
		
		for (String t: cities)
		{
			System.out.println(t);
		}
		
		
		System.out.println(cities.size());
		
		
		System.out.println(cities.contains("Hyderabad")); 
		
	}

}
