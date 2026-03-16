package TestPractice;

import java.util.HashMap;

public class TestCode {
	public static void main(String[] args) {

		String str = "automation";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch)<i) {
				continue;
			}

			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
				
			}
			System.out.println(ch + " : " + count);
		}

	}
}