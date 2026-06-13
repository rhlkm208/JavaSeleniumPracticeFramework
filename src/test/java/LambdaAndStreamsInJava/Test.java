package LambdaAndStreamsInJava;

import java.util.Arrays;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		
		List<Integer> age =
                Arrays.asList(20, 30, 12, 32, 23, 14);

        age.stream()
                .filter(a -> a > 20)
                .forEach(a -> System.out.println(a));
        
			}

}
