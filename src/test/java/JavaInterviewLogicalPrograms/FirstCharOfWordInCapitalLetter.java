package JavaInterviewLogicalPrograms;

public class FirstCharOfWordInCapitalLetter {

	public static void main(String[] args) {
		String str = "This is rahul kumar";
		String[] words = str.split(" ");

		StringBuffer sb = new StringBuffer();

		for (String word : words) {
			sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
		}

		System.out.println(sb);
	}

}
