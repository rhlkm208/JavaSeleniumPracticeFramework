package Array;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int[] arr = {11, 8, 88, 36, 99, 43, 21};

		int max1 =0;
		int max2 =0;
		
		if(arr[0]>arr[1]) {
			max1=arr[0];
			max2=arr[1];
			
		}
		else {
			max1=arr[1];
			max2=arr[0];
		}
		
		for(int i=2; i<arr.length; i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2) {
				max2=arr[i];
			}
		}
		
		System.out.println(max1);
		System.out.println(max2);
	}

}
