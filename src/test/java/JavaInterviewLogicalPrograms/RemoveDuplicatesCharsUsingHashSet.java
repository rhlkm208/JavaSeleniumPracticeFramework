package JavaInterviewLogicalPrograms;

import java.util.HashSet;

public class RemoveDuplicatesCharsUsingHashSet {
	
	public static void main(String[] args) {

		String str = "Automation";
		str = str.toLowerCase();
		String res = "";
		
		char[] ch = str.toCharArray();
	
		HashSet<Character> hsetunique = new HashSet<>();
		HashSet<Character> hsetduplicate = new HashSet<>();
		
		for(char c: ch) {
			
			if(!hsetunique.contains(c)) {
				hsetunique.add(c);
				res = res+c;
				
			}
			else {
				hsetduplicate.add(c);
			}
			
		}
		
		System.out.println(hsetunique);
		System.out.println(hsetduplicate);
		System.out.println(res);
		
		
		
		
	}

}
