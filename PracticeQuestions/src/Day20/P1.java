package Day20;

//.....[Marker Interface].....//
// Does Not Contain Any Method In this Interface
interface I1{
     // No Method in this Interface
}
//....[Functional Interface]....//
// Only have one Abstract Method
interface I2{
	void m1();
	
	default void m2() {
		System.out.println("Default Method m2");
	}
	static void m3() {
		System.out.println("Static Method m3");
	}
}
public class P1 {
	public static void main(String[] args) {
		
	}
}
