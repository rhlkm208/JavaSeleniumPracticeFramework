package ConceptualTrickyPrograms;

public class EqualsTrap {

	public static void main(String[] args) {
		
		Integer a = 127; 
		Integer b = 127; 
		System.out.println(a == b); 
		
		Integer x = 128; 
		Integer y = 128; 
		System.out.println(x == y);

		/*
		 * Output: 
		 * true 
		 * false 
		 * Integer values between -128 to 127 are cached. 
		 * Outside range creates new objects.
		 */

	}

}
