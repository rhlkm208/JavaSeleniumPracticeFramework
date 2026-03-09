package LogicalPrograms;

import java.util.Scanner;

public class TotalCharCountInGivenString {

	public static int countChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "My Name is Rahul";
		str.toLowerCase();
		
		System.out.println("Enter Char");
		Scanner sc = new Scanner(System.in);
		char ch =sc.next().charAt(0);
		
		System.out.println("given character "+ ch +" occurrence is " + countChar(str,ch) +" times");
		}

}
