package collections1;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cities =new LinkedList<>();
		cities.add("London");
		cities.add("Paris");
		cities.add(2,"New Delhi");
		cities.add("Mumbai");
		
		System.out.println(cities.size());
		System.out.println(cities.get(1));
		System.out.println(cities.contains("Mumbai"));
		
		Iterator itr = cities.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
