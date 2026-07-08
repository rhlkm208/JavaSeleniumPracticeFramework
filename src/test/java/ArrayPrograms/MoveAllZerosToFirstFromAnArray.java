package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToFirstFromAnArray {
	
	public static void main(String[] args) {

//		input - [1,0,1,0,1] 
//		output - [0,0,1,1,1]

		List<Integer> arrlist = Arrays.asList(1, 0, 1, 0, 1);
		ArrayList<Integer> newarrlist = new ArrayList<>();

		int count = 0;

		for (int num : arrlist) {

			if (num == 0) {
				count++;

			}
		}

			for (int i = 0; i < count; i++) {
				newarrlist.add(0);
			}

			for (int j = count; j < arrlist.size(); j++) {
				newarrlist.add(1);
			}
			System.out.println(newarrlist);
		}
		

}

