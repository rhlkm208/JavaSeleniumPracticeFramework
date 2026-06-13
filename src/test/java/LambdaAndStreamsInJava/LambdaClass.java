package LambdaAndStreamsInJava;

interface Greeting {
    void greet();
}

interface DoubleNumber {
    int doubleIt(int a);
}

interface Add {
    int add(int a, int b);
}

interface SafeDivide {
    int divide(int a, int b);
}

interface StringLength {
    int length(String s);
}

public class LambdaClass {

    public static void main(String[] args) {

        Greeting greetingFunction =
                () -> System.out.println("Hello World");

        DoubleNumber doubleNumberFunction =
                a -> a * 2;

        Add addFunction =
                (a, b) -> a + b;

        SafeDivide safeDivideFunction =
                (a, b) -> {
                    if (b == 0)
                        return 0;
                    return a / b;
                };

        StringLength stringLengthFunction =
                s -> s.length();

        greetingFunction.greet();
        System.out.println(doubleNumberFunction.doubleIt(10));
        System.out.println(addFunction.add(10, 20));
        System.out.println(safeDivideFunction.divide(20, 5));
        System.out.println(stringLengthFunction.length("Rahul"));
    }
}