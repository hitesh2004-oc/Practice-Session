package Day23;
//.....Method Reference.....//
//(1)Reference to a Static Method
//(2)Reference to a Instance Method
//(3)Reference to Constructor

//Types used here: Reference to a Static Method

//Functional interface with no arguments
interface P {
 void print();
}

//Functional interface for addition
interface Y1 {
 int sum(int a, int b);
}

//Functional interface to get string length
interface Y2 {
 int stringLength(String s);
}

//Functional interface to check voting eligibility
interface Y3 {
 boolean VoteEligible(int x);
}

class B {

 // Static method referenced by interface P
 public static void show() {
     System.out.println("Show Method");
 }

 // Static method referenced by interface Y1
 public static int add(int x, int y) {
     return x + y;
 }

 // Static method referenced by interface Y2
 public static int lengthOfName(String s1) {
     return s1.length();
 }
}

public class P2 {

 // Static method referenced using class name
 public static boolean vote(int a) {
     return a >= 18;
 }

 public static void main(String[] args) {

     // Method reference to static method show()
     P p = B::show;
     p.print();

     // Method reference to static method add()
     Y1 y1 = B::add;
     System.out.println(y1.sum(10, 20));

     // Method reference to static method lengthOfName()
     Y2 y2 = B::lengthOfName;
     System.out.println(y2.stringLength("Hitesh"));

     // Method reference to static method vote()
     Y3 y3 = P2::vote;
     System.out.println(y3.VoteEligible(22));
 }
}
