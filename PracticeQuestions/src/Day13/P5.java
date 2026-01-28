package Day13;

public class P5 {
	public static void main(String[] as) {
		System.out.println("main Begin");
		String s = null;
		try {
			s = as[0];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Provide the Value");
			System.out.println(e);
		}
		int x = 0;
		try {
			x = Integer.parseInt(s);
			System.out.println(x);
		}
		catch(NumberFormatException e) {
			System.out.println("Please Provide Integer Number");
			System.out.println(e);
		}
		try {
			int y = 10/x;
			System.out.println(y);
		}
		catch(ArithmeticException e) {
			System.out.println("Please Don't Provide Zero");
			System.out.println(e);
		}
		System.out.println("main end");
		
		/* Case 1:- No Argument
		   main Begin
           Please Provide the Value
           java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
           Please Provide Integer Number
           java.lang.NumberFormatException: Cannot parse null string
           Please Don't Provide Zero
           java.lang.ArithmeticException: / by zero
           main end 
		 */
		
	}

}
