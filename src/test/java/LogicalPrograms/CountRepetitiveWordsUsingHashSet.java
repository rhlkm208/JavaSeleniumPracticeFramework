package LogicalPrograms;

import java.util.HashSet;
import java.util.Set;

public class CountRepetitiveWordsUsingHashSet {

	public static void main(String[] args) {

		String str = "What is your name My Name is Rahul";

		// Convert to lowercase to avoid case-sensitivity issues
		String[] words = str.toLowerCase().split(" ");

		Set<String> uniqueWords = new HashSet<>();
		Set<String> repeatedWords = new HashSet<>();

		for (String word : words) {
			// If word cannot be added, it is a duplicate
			if (!uniqueWords.add(word)) {
				repeatedWords.add(word);
			}
		}

		System.out.println("unique Words: " + uniqueWords);
		System.out.println("Repeated Words: " + repeatedWords);
		System.out.println("Total Repeated Words Count: " + repeatedWords.size());
	}
}
