package LambdaAndStreamsInJava;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,1);

		Set<Integer> set = new HashSet<>();

		list.stream()
		    .filter(x -> !set.add(x))
		    .forEach(System.out::println);

	}

}
