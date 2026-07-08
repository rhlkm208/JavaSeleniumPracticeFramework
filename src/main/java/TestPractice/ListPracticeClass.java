package TestPractice;

import java.util.*;

public class ListPracticeClass {

	public static void main(String[] args) {
		
		String[] fruitList = {"Banana", "Mango", "Orange"};
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.addAll(Arrays.asList(fruitList));
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Grapes");
		
		HashMap<String, Integer> hm = new HashMap<>();
		
        for(String fruit : fruits) {
			
			hm.put(fruit, hm.getOrDefault(fruit, 0)+1);
		}
        
        System.out.println(hm);
		

		
		
		
		

	}

}
