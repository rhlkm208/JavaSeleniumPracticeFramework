package StringPrograms;

public class StringDecompressionProgram {

	public static void main(String[] args) {
		
		String str = "4r3a2j";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i=i+2) {
			
			int count = Character.getNumericValue(str.charAt(i));
			char ch = str.charAt(i+1);
			
			for(int j=0; j<count; j++) {
				sb.append(ch);
			}
		}
		
		System.out.println(sb);

	}

}
