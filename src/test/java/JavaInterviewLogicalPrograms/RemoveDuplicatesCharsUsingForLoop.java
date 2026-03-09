package JavaInterviewLogicalPrograms;

public class RemoveDuplicatesCharsUsingForLoop {

	public static void main(String[] args) {
		String str = "programming";
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			if (!res.contains("" + str.charAt(i))) {
				res = res + str.charAt(i);
			}
		}
		System.out.println(res);
	}
}