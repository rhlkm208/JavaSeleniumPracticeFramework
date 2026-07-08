package ArrayPrograms;

import java.util.Arrays;

public class MoveAllZerosToFirst {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 5};
        int[] result = new int[arr.length];

        int index = 0;

        // Add zeros first
        for (int num : arr) {
            if (num == 0) {
                result[index++] = 0;
            }
        }

        // Add non-zeros
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}