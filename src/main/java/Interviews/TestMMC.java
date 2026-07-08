package Interviews;

import java.util.ArrayList;

public class TestMMC {

	public static void main(String[] args) {
		int[] arr = {5, 24, 65, 12, 15, 12};
		
		ArrayList<Integer> arrlist = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]!=arr[j]) {
					arrlist.add(arr[j]);
					break;
				}
			}
		}
		
		System.out.println(arrlist);

	}

}
