package CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SecondHighestUniqueNumber {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(5, 3, 9, 1, 9, 5);
		List<Integer> numList2 = Arrays.asList(9, 9, 9, 9, 9);
		
		System.out.println(FindSecondHighestUniqueNumber(numList));
		System.out.println(FindSecondHighestUniqueNumber(numList2));
		
	}	
		public static Integer FindSecondHighestUniqueNumber(List<Integer> list) {
		HashSet<Integer> uniqueNum = new HashSet<>(list);
		
		
		  if(uniqueNum.size()<2) { 
			  return null;
		  
		  }
		 
		
		List<Integer> uniqueList = new ArrayList<>(uniqueNum);
		Collections.sort(uniqueList);
		return uniqueList.get(uniqueList.size()-2);

	}
		
	}	

