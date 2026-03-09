package JavaInterviewLogicalPrograms;

public class Palindrome {

	public static void main(String[] args) {

		String str = "Madam";

		str = str.toLowerCase();

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		System.out.println(rev);
		
		
// ----------------------------------------------------------		

		String str1 = "Level";
		str1 = str1.toLowerCase();
		String rev1 = "";

		char[] c = str1.toCharArray();

		for (int i = str1.length() - 1; i >= 0; i--) {
			rev1 = rev1 + c[i];
		}
		System.out.println("Reversed String: " + rev1);

		if (rev1.equalsIgnoreCase(str1)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("It's not Palindrome");
		}
		
		
// ----------------------------------------------------------		

		int num = 1992;
		int original = num;
		int dummy = 0;

		while (num != 0) {
			int rem = num % 10;
			dummy = (dummy * 10) + rem;
			num = num / 10;
		}
		System.out.println("Number = " + original);
		System.out.println("Dummy = " + dummy);

		if (original == dummy) {
			System.out.println(" It's Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
