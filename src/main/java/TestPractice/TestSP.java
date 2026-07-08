package TestPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;


public class TestSP {
	
	public static void main(String[] args) {
	
	List<Integer> ls = Arrays.asList(1,1,1,2,2,2,3,5,6,9,9);
	
	HashMap<Integer, Integer> hs = new HashMap<>();
	
	List<Integer> unique = new ArrayList<Integer> ();
	List<Integer> repeated = new ArrayList<Integer> ();
	
	for(int num : ls) {
		if(hs.containsKey(num)) {
			hs.put(num, hs.get(num)+1);
		}
		else {
			hs.put(num, 1);
		}
	}
	
	hs.forEach((key, value)-> {
		
		if(value>1) {
			repeated.add(key);
		}
		else if(value==1) {
			unique.add(key);
		}
	});
	
	System.out.println(unique);
	System.out.println(repeated);
	
    }

}
