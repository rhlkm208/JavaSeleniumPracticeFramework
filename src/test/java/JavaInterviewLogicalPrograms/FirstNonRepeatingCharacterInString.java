package JavaInterviewLogicalPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {

		String s1 = "Rahul Kumar";
		s1 = s1.toLowerCase();

		for (int i = 0; i < s1.length(); i++) {

			if (s1.indexOf(s1.charAt(i)) == s1.lastIndexOf(s1.charAt(i))) {
				System.out.println(s1.charAt(i));
				break;

			}
		}

//		2nd Method	
		System.out.println("2nd Method");

		String s2 = "Rahul kumar";
		s2 = s2.toLowerCase();
		char[] ch = s2.toCharArray();
		LinkedHashMap<Character, Integer> nonReptead = new LinkedHashMap<>();

		for (char c : ch) {

			nonReptead.put(c, nonReptead.getOrDefault(c, 0) + 1);

		}

		for (Entry<Character, Integer> entry : nonReptead.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non-repeated character: " + entry.getKey());
				break;

			}

		}

	}

}
