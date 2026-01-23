package Day13;

public class P2 {
	public static void main(String[] args) {
	  try {
		 System.out.println(10/0);
	  }catch(Exception e){
		  System.out.println(e);
	  }
//	  catch(ArithmeticException a) {
//		  System.out.println(a);
//	  }
	  finally {
		  System.out.println("Finally Block");
	  }
	}
}
