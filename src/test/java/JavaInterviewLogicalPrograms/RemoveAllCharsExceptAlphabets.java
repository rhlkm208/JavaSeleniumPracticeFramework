package JavaInterviewLogicalPrograms;

public class RemoveAllCharsExceptAlphabets {

	public static void main(String[] args) {
		String str = "123Welcome2Tesco123";
		
		String res = str.replaceAll("[^A-Za-z]", "");
		System.out.println(res);
		

	}

}
