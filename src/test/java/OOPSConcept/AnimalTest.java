package OOPSConcept;

public class AnimalTest {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class DogTest extends AnimalTest {
    void sound() {
        System.out.println("Dog barks");
    }

    void eat() {
        System.out.println("Dog eats");
    }
}

 class Test {
    public static void main(String[] args) {

    	AnimalTest a = new DogTest();   // ✅ Top Casting (Upcasting)
        a.sound(); // Dog barks
   //   b.eat(); ❌ Not accessible
         
        DogTest b = new DogTest();
        b.sound();
        b.eat();  // Easily  accessible
    }
}
