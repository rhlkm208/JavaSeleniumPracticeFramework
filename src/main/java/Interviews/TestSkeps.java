package Interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestSkeps {

	public static void main(String[] args) {
		
		
		 List<String> al = Arrays.asList("P1", "P2", "P1", "P3", "P2", "P4");
		 
		 HashMap<String, Integer> ls = new HashMap<>();
		
		 for(String str : al) {
			 ls.put(str, ls.getOrDefault(str, 0)+1);
		 }

		 System.out.println(ls);
	}

}
