package Array;

public class FindDuplicateNumberInTheArray {

	public static void main(String[] args) {

		int[] arr = { 12, 37, 45, 12, 34, 12, 37 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " ");
					break;
				}
			}

		}
	}
}
