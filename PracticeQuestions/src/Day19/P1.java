package Day19;

interface I {
	void m1();//public abstract
	
	default void m2() {
		System.out.println("Default m2 Method...");
	}
	
	static void m3() {
	    System.out.println("Static m3 Method... ");
	}
}
class A implements I{
	public void m1() {
		System.out.println("m1 Method in class A");
	}
}

class B implements I{
	public void m1() {
		System.out.println("m1 Method in class B");
	}
}

public class P1 {
	public static void main(String[] args) {
		I i1 = new A();
		 i1.m1();
		 i1.m2();
		 System.out.println("-----------------------------");
		I i2 = new B();
		 i2.m1();
		 i2.m2();
		
		
	}

}
