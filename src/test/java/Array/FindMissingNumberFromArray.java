package Array;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 40, 50};

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i+1] - arr[i] != 10) {
				System.out.println("Missing Number " + (arr[i] + 10));
				break;
			}
		}

	}

}
