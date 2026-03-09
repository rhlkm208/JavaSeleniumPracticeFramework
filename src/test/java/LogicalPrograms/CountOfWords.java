package LogicalPrograms;

public class CountOfWords {

	public static void main(String[] args) {
		String str = "My name is Rahul Kumar";
		
		String[] name = str.split(" ");
		
		for(int i=0; i<=name.length-1; i++) {
			System.out.println(name[i]);
		}
				
	System.out.println(name.length);

	}

}
