package TestPractice;

import java.util.Scanner;

public class TestNag {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (char c : ch) {
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));

			} else if (Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}

		}
		System.out.println(sb);
		sc.close();
	}

}
