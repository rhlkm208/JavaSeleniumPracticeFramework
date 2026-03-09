package LogicalPrograms;

public class ReverseEachWordsFromtheString {

	public static void main(String[] args) {

		String str = "Google office is in the Banglore and Banglore is the Hub of IT Industry";
		String[] words = str.split(" ");
		String res = "";

		for (String word : words) {
			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			res = res + rev + " ";
		}

		System.out.println("Original String: " + str);
		System.out.println("Reversed Words: " + res.trim());
	}
}