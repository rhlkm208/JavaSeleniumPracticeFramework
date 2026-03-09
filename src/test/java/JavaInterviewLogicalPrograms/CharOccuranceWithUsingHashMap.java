package JavaInterviewLogicalPrograms;

import java.util.HashMap;

public class CharOccuranceWithUsingHashMap {

	public static void main(String args[]) {

		String str = "Hello Rahul Kumar";
		str = str.toLowerCase();

		char[] ch = str.toCharArray();

		HashMap<Character, Integer> CharCount = new HashMap<>();

		for (Character c : ch) {
			if (CharCount.containsKey(c)) {

				CharCount.put(c, CharCount.get(c) + 1);
			} else {
				CharCount.put(c, 1);
			}

		}

		CharCount.forEach((key, value) -> {
			if (value > 1)
				System.out.println(key + " : " + value);
		}

		);

	}
}
