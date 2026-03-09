package JavaInterviewLogicalPrograms;

public class CheckAllCharsAreUniqueInTheString {

	public static void main(String[] args) {

		String str = "Rahul";
		boolean isUnique = true;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					isUnique = false;
					break;

				}

			}

		}

		System.out.println(isUnique);
	}

}
