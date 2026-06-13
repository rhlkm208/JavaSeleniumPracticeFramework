package JavaInterviewLogicalPrograms;

import java.util.Arrays;

public class SortWordsWhileUsingArraysSort {

	public static void main(String[] args) {

		String str = "automation selenium framework";
		String[] words = str.split(" ");

		Arrays.sort(words);

		for (String word : words) {
			System.out.println(word);
		}
	}
}
