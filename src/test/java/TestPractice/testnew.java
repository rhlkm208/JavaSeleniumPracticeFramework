package TestPractice;

import java.util.HashSet;
import java.util.Set;

public class testnew {
	
	public static void findDuplicates(int[] num) {
		HashSet<Integer> all = new HashSet<>();
		HashSet<Integer> dup = new HashSet<>();
		for(int a : num) {
			if(!all.add(a)) {
				dup.add(a);
			}
		}
		
		System.out.println(dup);
		
	}
	
	public static void commonsets(int[] num1, int[] num2) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> common = new HashSet<>();
		for(int num : num1) {
			set1.add(num); 		
		}
		
		
		for(int num : num2) {
			if(set1.contains(num)) {
				common.add(num);
			}
		}
		System.out.println(common);
	}
	
	
	public static void main(String[] args) {
		int[] s1 = {1, 2, 2, 4, 6, 6};
        int[] s2 = {8, 2, 6, 4, 6, 9, 0, 6};
        
        findDuplicates(s1);
        findDuplicates(s2);
        
        commonsets(s1, s2);
        
        
	}

}
