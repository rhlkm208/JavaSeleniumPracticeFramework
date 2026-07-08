package StringPrograms;

public class FindLastNonRepeatingCharacterInString {

	public static void main(String[] args) {
		String s1 = "Rahul Kumar".toLowerCase();

		for (int i = s1.length() - 1; i >= 0; i--) {
		    if (s1.indexOf(s1.charAt(i)) == s1.lastIndexOf(s1.charAt(i))) {
		        System.out.println(s1.charAt(i));
		        break;
		    }
		}

	}

}
