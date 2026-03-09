package OOPSConcept;

public class Dog extends Animal{
	
	public void AnimalSound() {
		System.out.println("Barking like Bow Bow");
	}

	public void color() {
		System.out.println("Color is Black");
	}


public static void main(String args[]) {
	Dog d = new Dog();
	d.AnimalSound();
	d.color();
	d.run();
}

}