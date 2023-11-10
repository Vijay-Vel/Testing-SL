package collections1;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> td = new HashMap<>();
		
		td.put(123, "Ravi");  
		td.put(1234, "Ram");
		td.put(125, "Raj");
		td.put(12345, "Vijay");
		td.put(12, "James");
		
		for(Entry m: td.entrySet())
		{
			System.out.println(m.getKey() + " - " +m.getValue());

		}
		
		System.out.println(td.remove(12));
		
		for(Entry m: td.entrySet())
		{
			System.out.println(m.getKey() + " - " +m.getValue());

		}
}
}