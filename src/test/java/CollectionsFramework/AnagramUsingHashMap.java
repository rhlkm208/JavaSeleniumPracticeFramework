package CollectionsFramework;

import java.util.HashMap;

public class AnagramUsingHashMap {

	public static void main(String[] args) {

		String str1 = "silent";
		char[] ch1 = str1.toCharArray();

		String str2 = "listen";
		char[] ch2 = str2.toCharArray();

		HashMap<Character, Integer> hs1 = new HashMap<>();
		HashMap<Character, Integer> hs2 = new HashMap<>();

		if (str1.length() != str2.length()) {
			System.out.println("Not An Anagram");
			return;
		}

		for (char c1 : ch1) {

			hs1.put(c1, hs1.getOrDefault(c1, 0) + 1);
		}

		for (char c2 : ch2) {

			hs2.put(c2, hs2.getOrDefault(c2, 0) + 1);
		}

		System.out.println(hs1);
		System.out.println(hs2);

		if (hs1.equals(hs2)) {
			System.out.println("It's Anagram");
		} else {
			System.out.println("It's not Anagram");
		}

	}

}
