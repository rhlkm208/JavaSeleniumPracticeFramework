package LogicalPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceForLongString {

	public static void main(String args[]) {

		String str = "Rahul Kumar";
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			/*
			 * if (ch == ' ' || str.indexOf(ch) < i) { continue; }
			 */
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch + " is " + count);
		}
		
	}
}
