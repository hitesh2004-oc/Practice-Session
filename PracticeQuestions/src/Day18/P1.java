package Day18; 
// Java 8 Functional Interface and Lambda Expression //

// Functional Interface
// It contains only one abstract method (SAM – Single Abstract Method)
interface I {
    void show();   // Abstract method
}

public class P1 {
    public static void main(String[] args) {

        // Lambda Expression
        // () -> represents the implementation of the show() method
        // No need to write class or method body explicitly
        I i1 = () -> System.out.println("show method....");

        // Calling the show() method
        i1.show();
    }
}
