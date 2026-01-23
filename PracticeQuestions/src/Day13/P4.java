package Day13;

public class P4 {
      public static void main(String[] as) {
		System.out.println("main Begin");
		try {
			int x = Integer.parseInt(as[0]);
			System.out.println(x);
			
			int y = 10/x;
			System.out.println(y);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Provide the Value");
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println("Please Provide Integer Number");
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println("Please Don't Provide Zero");
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Please Don't do this");
			System.out.println(e);
		}
		System.out.println("main end");
		
/* 
      Case 1: if we Provide no Argument then
      output :-
      main begin      [first Print]    
      Please Provide the Value    [Second Print]  
      java.lang.ArrayIndexOutOfBoundsException  [Third Print]
      main end
      
      Case 2: if we Provide Argument 0 then
      output :-
      main begin      [first Print]    
      0               [Second Print]  
      Please Don't Provide Zero [Third Print]
      main end
 */

	}
}
