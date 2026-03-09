package LogicalPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// 1st Method of reversing the string

				String str = "Hello";

				System.out.print(str.charAt(4));
				System.out.print(str.charAt(3));
				System.out.print(str.charAt(2));
				System.out.print(str.charAt(1));
				System.out.print(str.charAt(0));

				System.out.println(" ");

				// 2nd Method of reversing the string
				String str1 = "Rahul";
				String rev = "";

				char[] c = str1.toCharArray();
				for (int i = str1.length() - 1; i >= 0; i--) {
					rev = rev + c[i];
				}
				System.out.println(rev);

				// 3rd Method of reversing the string

				String str2 = "Kumar";

				StringBuffer strRev = new StringBuffer(str2);
				strRev.reverse();
				System.out.println(strRev);
				
				
				// 4th Method of reversing the string
				
					String str3 = "Eclipse";
					for(int j=str3.length()-1; j>=0; j--) {
					System.out.print(str3.charAt(j));
					}
				System.out.println(" ");
					
			  // 5th Method of reversing the string
					String str4="Reverse";
					StringBuilder sb= new StringBuilder();
					sb.append(str4);
					sb.reverse();
					System.out.println(sb);
					
	}
}
