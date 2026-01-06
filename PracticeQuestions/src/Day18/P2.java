package Day18;

// Functional Interface
// Contains only one abstract method (SAM)
interface I1 {
    void printStringLength(String s);
}

public class P2 {
    public static void main(String[] args) {

        // Lambda Expression
        // s -> represents the implementation of the printStringLength() method
        // No need to write a separate class or method body

        // No brackets () needed because there is only one parameter
        // No curly braces {} needed because the lambda has a single statement
        I1 i1 = s -> System.out.println("String length:- " + s.length());

        // Calling the abstract method
        i1.printStringLength("Hitesh");
    }
}

