package LogicalPrograms;

public class GetChars {

	public static void main(String[] args) {
		
		String Sentence = "My Name is Rahul Kumar";
		
		char target [] = new char[4];
		
		Sentence.getChars(3, 7, target, 0);
		
		System.out.println(target);

	}

}
