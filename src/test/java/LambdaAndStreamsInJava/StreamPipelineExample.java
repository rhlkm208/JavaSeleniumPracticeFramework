package LambdaAndStreamsInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
		        "Rahul", "Amit", "Ankit", "Rohit"
		);

		List<String> result =
		        names.stream()
		             .filter(x -> x.startsWith("R"))
		             .map(String::toUpperCase)
		             .sorted()
		             .collect(Collectors.toList());

		System.out.println(result);
	}
}
