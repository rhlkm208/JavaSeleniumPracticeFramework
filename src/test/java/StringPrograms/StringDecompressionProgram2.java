package StringPrograms;

public class StringDecompressionProgram2 {

	public static void main(String[] args) {

		String str = "3[a]2[bc]";
		String str1 = "";
		String str2 = "";
		int n = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				n = Character.getNumericValue(ch);
			} else if (Character.isLetter(ch)) {
				str1 = str1 + ch;
			} else if (str.charAt(i) == ']') {
				for (int j = 0; j < n; j++) {
					str2 = str2 + str1;
				}
				str1 = "";
			}
		}

		System.out.println(str2);

	}

}
