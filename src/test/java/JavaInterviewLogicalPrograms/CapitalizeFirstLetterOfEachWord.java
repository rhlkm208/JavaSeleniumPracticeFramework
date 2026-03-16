package JavaInterviewLogicalPrograms;

public class CapitalizeFirstLetterOfEachWord {

	// Method - 1 (No Return Type)
	public void CapFirstLetter() {
		String sentence1 = "Your name is Rahul";
		String[] sents = sentence1.split(" ");

		StringBuilder sb = new StringBuilder();

		for (String sent : sents) {
			sb.append(Character.toUpperCase(sent.charAt(0))).append(sent.substring(1).toLowerCase()).append(" ");
		}
		System.out.println(sb);
	}

	// Method - 2 (With Return Type)
	public static String capitalizeEachWord(String sentence) {

		if (sentence == null || sentence.isEmpty())
			return sentence;

		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			if (!word.isEmpty()) {
				result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase())
						.append(" ");
			}
		}
		return result.toString().trim();

	}

	public static void main(String[] args) {

		String str = CapitalizeFirstLetterOfEachWord.capitalizeEachWord("My name is Rahul");
		System.out.println(str);

		CapitalizeFirstLetterOfEachWord capFir = new CapitalizeFirstLetterOfEachWord();
		capFir.CapFirstLetter();

	}

}
