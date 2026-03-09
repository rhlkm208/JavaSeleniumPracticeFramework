package LogicalPrograms;

public class CharOccuranceWithForLoop {

	public static void main(String[] args) {
		String str = "Google";	
		
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			
			if (ch == ' ' || str.indexOf(ch) < i) {
				continue;
			}
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ch) {
					count++;
				}
			}
			System.out.println("Character " + ch + " occurs " + count + " times");
		}

	}
}
