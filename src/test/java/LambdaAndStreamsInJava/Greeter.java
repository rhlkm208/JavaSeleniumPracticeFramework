package LambdaAndStreamsInJava;

public class Greeter {
	public void greet(Greetings greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter = new Greeter();

		Greetings innerClassGreeting = new Greetings() {
			public void perform() {
				System.out.println("Hello world!");
			}
		};

		Greetings lambdaGreeting = () -> System.out.print("Hello World!");

		greeter.greet(lambdaGreeting);
		greeter.greet(innerClassGreeting);
	}
}
