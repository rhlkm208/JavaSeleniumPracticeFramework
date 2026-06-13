package PracticeTest;

public class TestUnited {

	public static void main(String[] args) {
		
		String str = "aaabbbbbccccdd";
		int count =1;
		String res = "";

		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}
			else {
				res = res + str.charAt(i)+count;
				count =1;
			}
		}
		
		res = res + str.charAt(str.length()-1)+count;
		System.out.println(res);
	}

}
