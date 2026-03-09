package Array;

public class LargestNumberInArray {
	
	public static void main(String[] args) {
		
// 1st Method		
        
        int[] arr = {20, 5, 80, 40, 76};
        

        int largest = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
        
 // 2nd Method       
        int[] arr1 = {200, 50, 800, 400, 760};

 //       int largest = arr1[0];
        for (int i = 1; i < 5; i++) {
            if (arr1[i] > arr1[0]) {
            	arr1[0] = arr1[i];
            }
        }

        System.out.println("Largest element: " + arr1[0]);
    }

}
