package JavaInterviewLogicalPrograms;

public class FindAllPossibleSubstring {
	
	public static void main(String[] args) {
	String str = "Hello123! World@2024#";
	
	StringBuilder sb = new StringBuilder();
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		if(Character.isLetter(ch) || ch == ' ')
			sb.append(ch);
		}
	
	System.out.println(sb);
	System.out.println("Output: "
            + sb.toString());
	}

}
