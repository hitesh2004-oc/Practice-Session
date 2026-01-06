package Day18;

// Functional Interface
// Contains only one abstract method (SAM)
interface I2 {
    void printAddition(int a,int b);
}

public class P3 {
    public static void main(String[] args) {

        // Lambda Expression
        // No need to write a separate class or method body

        // No curly braces {} needed because the lambda has a single statement
        I2 i1 = (a,b)-> System.out.println("Addition : "+(a+b));

        // Calling the abstract method
        i1.printAddition(10,20);
    }
}

