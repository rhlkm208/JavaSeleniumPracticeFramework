package JavaInterviewLogicalPrograms;

public class RemoveDuplicatesCharsUsingForLoop {

	public static void main(String[] args) {
		String str = "banana";
		String res = "";
		
//		Method 1 - Remove Duplicates

		for (int i = 0; i < str.length(); i++) {
			if (!res.contains("" + str.charAt(i))) {
				res = res + str.charAt(i);
			}
		}
		System.out.println(res);
		
//		Method 2 - Remove Duplicates		
		for(int j=0; j<str.length(); j++) {
			char ch = str.charAt(j);
			
			if(ch==' '||str.indexOf(ch)<j) {
				continue;
			}
			
			System.out.print(ch);
		}
	}
}