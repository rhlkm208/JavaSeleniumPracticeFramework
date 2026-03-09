package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class TestProgDemo {

	public static void main(String[] args) {
		
		String str = "Madam Soni Raushni Madam Rani";
		
		String[] words = str.split(" ");
		
		HashMap<String, Integer> wordcount = new HashMap<>();
		
		for(String word:words) {
			if(wordcount.containsKey(word)) {
				wordcount.put(word, wordcount.get(word)+1 );
			}
			else {
				wordcount.put(word, 1);
			}
		}
		
		wordcount.forEach((key, value) ->{
			System.out.println(key +" is: " + value);
		}
				);		
		
	
		String str1 = "Java Selenium Java";
		String[] words1 = str1.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for (String word1 : words1) {
		    map.put(word1, map.getOrDefault(word1, 0) + 1);
		}

		System.out.println(map);
				
		
}
}