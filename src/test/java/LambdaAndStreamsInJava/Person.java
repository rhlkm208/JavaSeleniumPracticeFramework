package LambdaAndStreamsInJava;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getter for FirstName
    public String getFirstName() {
        return firstName;
    }

    // Setter for FirstName (Optional, but good practice)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for LastName
    public String getLastName() {
        return lastName;
    }

    // Setter for LastName (Optional)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for Age (Optional)
    public int getAge() {
        return age;
    }

    // Setter for Age (Optional)
    public void setAge(int age) {
        this.age = age;
    }

    // Optional: toString method for easy debugging/printing
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}