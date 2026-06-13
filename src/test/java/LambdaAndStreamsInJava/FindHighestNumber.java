package LambdaAndStreamsInJava;

import java.util.Arrays;
import java.util.List;

public class FindHighestNumber {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(5,8,2,10,3);

		int max = nums.stream()
		              .max(Integer::compare)
		              .get();

		System.out.println(max);
	}

}
