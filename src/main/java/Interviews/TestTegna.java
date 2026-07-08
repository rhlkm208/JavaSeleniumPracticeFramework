package Interviews;

import java.util.HashSet;

public class TestTegna {

	public static void main(String[] args) {

		int[] nums = {1, 2, 3, 2, 4, 5, 1};
		
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hsdup = new HashSet<>();
		
		
		for(int num : nums) {
			
			if(!hs.add(num)) {
				hsdup.add(num);
			}
		}
		
		System.out.println(hsdup);

	}

}
