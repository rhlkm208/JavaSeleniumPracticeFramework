package JavaInterviewLogicalPrograms;

public class ReverseLettersOnlyAndKeepDigitsAsItIs {

	    public static void main(String[] args) {

	        String actualString = "test12pop90java989pyt767test";

	        char[] arr = actualString.toCharArray();

	        int left = 0;
	        int right = arr.length - 1;

	        while (left < right) {

	            // If left is digit, move forward
	            if (Character.isDigit(arr[left])) {
	                left++;
	            }
	            // If right is digit, move backward
	            else if (Character.isDigit(arr[right])) {
	                right--;
	            }
	            // Both are letters → swap
	            else {
	                char temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;

	                left++;
	                right--;
	            }
	        }

	        String expectedString = new String(arr);
	        System.out.println("ExpectedString = " + expectedString);
	    }
	}

