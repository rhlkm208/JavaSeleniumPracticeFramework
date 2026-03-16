package JavaInterviewLogicalPrograms;

public class CheckTheStringImmutableOrNot {
	
	public static void main(String[] args) {

		String s = "Rahul";
		s.concat(" Kumar");

		
		String s1 = "Rahul";
		String s2 = s1.concat(" Kumar");

		
		System.out.println(s1); // output - Rahul
		System.out.println(s1); // output - Rahul
		System.out.println(s2); // output - Rahul Kumar
		
		
	// String is Immutable	--> String Can not get changed and the value should get remain same
		String str = new String("Hello");
		str.concat(" Kumar");
		
		System.out.println(str); // output - Hello

	// StringBuilder is Mutable	-->  StringBuilder Can get changed and the variable should have a different value
		StringBuilder sb = new StringBuilder("Rahul");
		sb.append(" Kumar");

		System.out.println(sb); // output - Rahul Kumar
	}

}
