package Day18;  

import java.util.function.Predicate;   
//............Predicate functional interface............//
public class P4 {
    public static void main(String[] args) {

        // Predicate is a functional interface that takes one argument
        // and returns a boolean value (true/false)

        // Lambda expression implementing the test() method of Predicate
        // It checks whether the given integer is even or not
        Predicate<Integer> p1 = i -> {
            if (i % 2 == 0) {
                return true;    // Returns true if number is even
            } else {
                return false;   // Returns false if number is odd
            }
        };

        // Calling the test() method of Predicate
        // Passing 10 as an argument
        System.out.println(p1.test(10));
    }
}
