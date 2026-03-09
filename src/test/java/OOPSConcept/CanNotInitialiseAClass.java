package OOPSConcept;

public class CanNotInitialiseAClass {
		
		    // Private constructor
		    private CanNotInitialiseAClass() {
		        // Prevent object creation
		    }
		    
	    public void display() {
		        System.out.println("This is a display method.");
		    }

		    public static void printMessage() {
		        System.out.println("Hello Utility");
		    }				
		    
		    public static void main(String[] args) {
		    CanNotInitialiseAClass obj = new CanNotInitialiseAClass(); // This will cause a compilation error
		    obj.printMessage();
		    obj.display();
		        // Instead, we can use the static method
		        CanNotInitialiseAClass.printMessage();
		    }


	}

