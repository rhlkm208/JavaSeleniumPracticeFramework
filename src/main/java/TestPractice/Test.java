package TestPractice;

public class Test {

    static void check(int age) throws MyException {

        if (age < 18) {
            throw new MyException("Age < 18");
        }

    }

    public static void main(String[] args) throws MyException {

        check(15);

    }
}

