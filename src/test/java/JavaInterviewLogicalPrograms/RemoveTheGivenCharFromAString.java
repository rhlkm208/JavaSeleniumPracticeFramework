package JavaInterviewLogicalPrograms;

public class RemoveTheGivenCharFromAString {

	public static void main(String[] args) {

		String str = "Rahul Kumar";
		char ch = 'a';
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result = result+ str.charAt(i);
			}
		}
		System.out.println(result);

	}

}
