package StringPrograms;

public class FindTheLongestAndShortestWordInAString {

	public static void main(String[] args) {
		String str = "Automation testing improves software Automation @#$ quality and reduces manual effort";

		String[] words = str.replaceAll("[^a-zA-Z]", " ").split("\\s+");

		String longest = words[0];
		String shortest = words[0];

		for (String word : words) {

			if (word.length() > longest.length()) {
				longest = word;

			}

			else if (word.length() < shortest.length()) {
				shortest = word;
			}

		}

		System.out.println("Longest word: " + longest);
		System.out.println("Shortest word: " + shortest);
	}

}
