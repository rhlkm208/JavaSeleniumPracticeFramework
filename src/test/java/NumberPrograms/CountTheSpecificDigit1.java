package NumberPrograms;

public class CountTheSpecificDigit1 {

	public static void main(String[] args) {
		
		int num = 564543555;
		int count=0;

		while(num>0) {
		int rem = num%10;
		
		if(rem==5) {
			count++;
		}
		num = num/10;
		
	}
		System.out.println("number of times 5 appears: " +count);
	}
}
