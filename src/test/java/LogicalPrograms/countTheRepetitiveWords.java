package LogicalPrograms;

import java.util.HashMap;

public class countTheRepetitiveWords {

	public static void main(String[] args) {
		String str = "What is your name My Name is Rahul";
		str = str.toLowerCase();

		String[] words = str.split(" ");

		HashMap<String, Integer> wordCount = new HashMap<>();

		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		int repetitiveWordCount = 0;

		System.out.println("Repetitive words are:");

		for (String word : wordCount.keySet()) {
			if (wordCount.get(word) > 1) {
				repetitiveWordCount++;
				System.out.println(word + " -> " + wordCount.get(word) + " times");

			}

		}

		System.out.println("Total number of repetitive words:" + repetitiveWordCount);

	}

}
