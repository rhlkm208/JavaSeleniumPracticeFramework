package LogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Testnew {

	public static void main(String[] args) {

		String[] arr = {"apple", "banana", "cat", "dog"};
		int count = 0;

		for(String word : arr) {
			char[] ch = word.toCharArray();
			
			for(char c : ch) {
				if(c=='a') {
					count++;
				}
			}
		}
		
		System.out.println("Total count of a are " + count);
	}
}
