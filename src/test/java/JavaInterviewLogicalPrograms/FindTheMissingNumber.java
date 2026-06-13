package JavaInterviewLogicalPrograms;

public class FindTheMissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7};

        int n = 7;

        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;

        for (int num : arr) {
            actualSum = actualSum + num;
 
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}
