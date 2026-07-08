package TestProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 4, 0, 5, 2, 0};
		
		int[] res = new int[arr.length];
		
		ArrayList<Integer> al = new ArrayList<>();
		
		int count =0;
		
		for(int num : arr) {
			
			if(num==0) {
				res[count++]=0;
			}
			else {
				al.add(num);
			}
		}	

		Collections.sort(al, Collections.reverseOrder());
          
          for(int num : al) {
        	  res[count++] = num;
          }
          
          System.out.println(Arrays.toString(res));
	}

	}
