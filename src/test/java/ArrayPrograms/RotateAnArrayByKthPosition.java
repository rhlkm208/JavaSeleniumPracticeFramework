package ArrayPrograms;

import java.util.Arrays;

public class RotateAnArrayByKthPosition {
   
	public static void main(String[] args) {
		
//		input = [1, 2, 3, 4, 5]
//		output = [4, 5, 1, 2, 3]
//		N =2
		
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        int len = arr.length;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
        	
            result[(i + n) % len] = arr[i];           
        }

        System.out.println(Arrays.toString(result));
    }
}