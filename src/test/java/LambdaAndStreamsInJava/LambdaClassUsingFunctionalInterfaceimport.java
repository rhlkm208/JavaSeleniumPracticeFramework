package LambdaAndStreamsInJava;

import java.util.function.*;

public class LambdaClassUsingFunctionalInterfaceimport {

    public static void main(String[] args) {

        Runnable greetingFunction =
                () -> System.out.println("Hello World");

        Function<Integer, Integer> doubleNumberFunction =
                a -> a * 2;

        BinaryOperator<Integer> addFunction =
                (a, b) -> a + b;

        BinaryOperator<Integer> safeDivideFunction =
                (a, b) -> b == 0 ? 0 : a / b;

        Function<String, Integer> stringLengthFunction =
                s -> s.length();

        greetingFunction.run();
        System.out.println(doubleNumberFunction.apply(10));
        System.out.println(addFunction.apply(10, 20));
        System.out.println(safeDivideFunction.apply(20, 5));
        System.out.println(stringLengthFunction.apply("Rahul"));
    }
}