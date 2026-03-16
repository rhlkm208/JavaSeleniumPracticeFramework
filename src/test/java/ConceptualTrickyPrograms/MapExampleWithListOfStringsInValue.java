package ConceptualTrickyPrograms;

import java.util.*;

public class MapExampleWithListOfStringsInValue {
    public static void main(String[] args) {
    	
    	
		/*
		 * Question:- store the below in any DS of your choice 
		 * ("state1","city1")
		 * ("state2","city2") 
		 * ("state2","city3") 
		 * ("state3","city4") 
		 * ("state4","city5")
		 */
    	
    	
        Scanner sc = new Scanner(System.in);
        String stateName = sc.nextLine();

        Map<String, List<String>> states = new HashMap<>();
        states.put("state1",Arrays.asList("city1"));
        states.put("state2",Arrays.asList("city2","city3"));
        states.put("state3",Arrays.asList("city4"));
        states.put("state4",Arrays.asList("city5"));

        
        states.forEach((key, value) -> {
        	
        	if(key.contains(stateName)) {
        		
        		for(String val : value) {
        			System.out.println(val);
        		}
        		
        	}
        	
        	
        });
    }
}