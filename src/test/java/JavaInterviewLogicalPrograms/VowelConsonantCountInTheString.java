package JavaInterviewLogicalPrograms;

public class VowelConsonantCountInTheString {
	
	public static void main(String[] args) {

		String str = "Automation";
		str = str.toLowerCase();
		
		char[] ch = str.toCharArray();
		int vowels =0;
		int consonants =0;


		for(Character c : ch) {
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowels++;
			}
			else {
				if(c>= 'a' && c<='z') {
					consonants++;
				}
				
			}
		}
		
		System.out.println("The total Vowel counts are: " + vowels);
		System.out.println("The total consonants counts are: " + consonants);
		
	}

}
