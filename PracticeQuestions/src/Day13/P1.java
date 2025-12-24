package Day13;

import java.util.List;
import java.util.Scanner;

//.......Exception Handling.......//
// Try & Catch[Try Never Use Alone][Use With Catch or Finally]
// Throw Keyword
// Throws Keyword
// Finally Block
// Try With Resources[Java 8]

public class P1 {
	void m1() {
		System.out.println("m1 Method");
	}
	public static void main(String[] args) {
       //...There Are Two Types of Exception...//
	   //(1) Runtime Exception[Unchecked Exception]
	   //(2) CompileTime Exception[Checked Exception]
		
	//..........Runtime Exception...........//
	   //(1).....Arithmetic Exception.....//
	   //...Uses Of Try & Catch...//
		int a = 10;
		int b = 0;
	    
		System.out.println("Starting Point"); // Source
		try {
			int c = a / b;  //Problem Statement
		}
		catch(Exception e) {
			System.out.println(e); //Handling Statement
		}
		System.out.println("Ending Point"); // Destination
//===============================================================//
		//(2).....Null Pointer.....//
		P1 p = null;
		try {
			p.m1();
		}
		//Cannot invoke "Day13.P1.m1()" because "p" is null//
		// Innner Logic [Exception e = new ArithmeticException()]
		catch(Exception e) {
			System.out.println(e);
		}
//===============================================================//
		//(3) There are Two type IndexOutOfBoundException //
		// (1) Array IndexOutOfBoundException
		// (2) String IndexOutOfBoundException
		//.....ArrayIndexOutOfBoundsException.....//
		int arr[] = new int[5];
		
		try {
			System.out.println(arr[6]);
		}
		//Index 6 out of bounds for length 5//
		catch(Exception e){
			System.out.println(e);
		}
//===============================================================//		
		//(4).....StringIndexOutOfBoundsException.....//
		String str = "Java";
		try {
			System.out.println(str.charAt(4));
		}
		//Index 4 out of bounds for length 4//
		catch(Exception e){
			System.out.println(e);
		}
//===============================================================//	
		//(5).....Class Cast Exception.....//
		Object o = "Hello";
		
		try {
			Integer i = (Integer) o;
		}
		catch(Exception e){
			System.out.println(e);
		}
//===============================================================//
		//(6)....NumberFormatException....//
		try {
			int n = Integer.parseInt("abc");
		}
		// For input string: "abc" //
		catch(Exception e){
			System.out.println(e);
		}
//===============================================================//		
		//(7)....IllegalStateException....//
		Scanner sc = new Scanner(System.in);
		sc.close();
		try {
			sc.nextInt();  // scanner already closed
		}
		
		catch(Exception e){
			System.out.println(e);
		}

//===============================================================//
		//(8)....IllegalArgumentException
		Thread t = new Thread();
		try {
			t.setPriority(100);  // valid range is 1–10
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
//===============================================================//
		//(9)....NegativeArraySizeException....//
		try {
			 int[] arr1 = new int[-5];		
			}
		catch(Exception e){
			System.out.println(e);
			}
//===============================================================//
		//(10)....UnsupportedOperationException....//
		List<Integer> list = List.of(1, 2, 3);
		
		try {
			list.add(4);  // immutable list	
			}
		catch(Exception e){
			System.out.println(e);
			}

	}

}
