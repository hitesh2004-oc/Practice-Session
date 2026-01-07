package Day19;

interface MathUtils {
    // Static method in an interface
    static int add(int a, int b) {
        return a + b;
    }
    
    // Another static utility method
    static boolean isValidNumber(int num) {
        return num > 0;
    }
}

public class P3 {
	 public static void main(String[] args) {
	        // Calling the static method using the interface name
	        int sum = MathUtils.add(5, 10); 
	        System.out.println("Sum: " + sum);
	        
	        System.out.println("Is 15 valid? " + MathUtils.isValidNumber(15));
	        System.out.println("Is -5 valid? " + MathUtils.isValidNumber(-5));
	    }
}
