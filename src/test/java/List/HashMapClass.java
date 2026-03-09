package List;

import java.util.HashMap;

public class HashMapClass {
	
	// HashMap is a collection class in Java that stores data in key–value pairs 
	// and allows fast retrieval of values using keys

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(0, "B.Tech");
		hm.put(1, "MBA");
		hm.put(2, "B.Pharma");
		hm.put(3, "BCA");
		
		System.out.println(hm.get(1));
		
		System.out.println(hm.size());

	}

}
