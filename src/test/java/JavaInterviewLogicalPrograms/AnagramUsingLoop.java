package JavaInterviewLogicalPrograms;

public class AnagramUsingLoop {

	public boolean areAnagrams(String str1, String str2) {
		// Remove spaces and convert to lowercase
		/*
		 * str1 = str1.replaceAll("\\s", "").toLowerCase(); str2 =
		 * str2.replaceAll("\\s", "").toLowerCase();
		 */

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// If lengths are different, they can't be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Count characters

		int[] count = new int[256]; // ASCII characters

		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++;
		    count[str2.charAt(i)]--;
		}

		for (int i : count) {
			if (i != 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {

		AnagramUsingLoop an = new AnagramUsingLoop();
		boolean res = an.areAnagrams("listen", "silent");
		System.out.println(res);

		// System.out.println(areAnagrams("listen", "silent")); // true
		// System.out.println(areAnagrams("hello", "world")); // false
	}
}