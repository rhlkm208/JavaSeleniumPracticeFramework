package JavaInterviewLogicalPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class countTheRepetitiveWordsUsingHashMap {

	public static void main(String args[]) {

		String str = "I am Rahul but that Rahul is not here so I am leaving as I have not met him";
		str = str.toLowerCase();
		String[] words = str.split(" ");

		HashMap<String, Integer> WordCount = new HashMap<>();

		for (String word : words) {

			if (WordCount.containsKey(word)) {
				WordCount.put(word, WordCount.get(word) + 1);
			} else {
				WordCount.put(word, 1);
			}
		}

		//1st Method :- Lambda Expression Method to print
		WordCount.forEach((key, value) -> {
			if (value > 1) {
				System.out.println(key + " : " + value);
			}
		});

		// 2nd Method :- Entry 
		for (Entry<String, Integer> entry : WordCount.entrySet()) {
			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + " : " + entry.getValue());

			}
		}
	}

}
