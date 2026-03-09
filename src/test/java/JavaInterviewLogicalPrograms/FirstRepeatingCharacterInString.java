package JavaInterviewLogicalPrograms;

public class FirstRepeatingCharacterInString {

	public static void main(String[] args) {

		String s1 = "Rahul Kumar";
		s1 = s1.toLowerCase();

		for (int i = 0; i < s1.length(); i++) {

			if (s1.indexOf(s1.charAt(i)) != s1.lastIndexOf(s1.charAt(i))) {
				System.out.println(s1.charAt(i));
				break;

			}

		}

	}

}