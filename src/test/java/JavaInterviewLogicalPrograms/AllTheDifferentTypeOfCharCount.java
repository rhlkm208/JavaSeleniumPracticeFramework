package JavaInterviewLogicalPrograms;

public class AllTheDifferentTypeOfCharCount {

	public static void main(String[] args) {
		String str = "Hello 123 Rahul @#$";

		int letterCount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		int specialCharCount = 0;

		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (Character.isLetter(c)) {
				letterCount++;
			} else if (Character.isDigit(c)) {
				digitCount++;
			} else if (Character.isSpaceChar(c)) {
				spaceCount++;
			} else {
				specialCharCount++;
			}
		}

		System.out.println("No of letter " + letterCount);
		System.out.println("No of digit " + digitCount);
		System.out.println("No of space " + spaceCount);
		System.out.println("No of Special Char " + specialCharCount);

	}

}
