package JavaInterviewLogicalPrograms;

public class StringCompressionProgram {
	 
	    public static void main(String[] args) {
	    	
	    	String str = "aabcccccaaaa";
			String result = "";

			int count = 1;

			for (int i = 0; i < str.length()-1; i++) {

				if (str.charAt(i) == str.charAt(i + 1)) {
					count++;
				} else {
					result = result + str.charAt(i) + count;
					count = 1;
				}
			}

			result = result + str.charAt(str.length() - 1) + count;

			System.out.println(result);

	    }

}
