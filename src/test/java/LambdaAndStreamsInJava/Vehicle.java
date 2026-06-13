package LambdaAndStreamsInJava;

interface Vehicle {

    // Abstract method
    void start();

    // Concrete method using default
    default void stop() {
        System.out.println("Vehicle Stopped");
    }

    // Static concrete method
    static void fuelType() {
        System.out.println("Petrol");
    }
    
    public static void model() {
        System.out.println("Petrol");
    }
    
    public default void color() {
        System.out.println("Petrol");
    }
}