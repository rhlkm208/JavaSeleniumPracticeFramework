package ArrayPrograms;

import java.util.Arrays;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 5};
		int n =5;
		int expected = n*(n+1)/2;
		int actual = Arrays.stream(arr).sum();
		
		System.out.println(expected-actual);
		
	}

}
