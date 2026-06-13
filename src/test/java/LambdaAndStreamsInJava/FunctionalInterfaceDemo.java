package LambdaAndStreamsInJava;

@FunctionalInterface
interface Calculator {

    int add(int a, int b);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Lambda Expression
        Calculator cal = (a, b) -> a + b;

        int result = cal.add(10, 20);

        System.out.println("Addition is: " + result);
    }
}