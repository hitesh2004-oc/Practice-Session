package Day4;
//......Use Of Interface......//
interface I1 {
	// I1(){
	// (Creation of Constructor Not allowed in Interface)
	// }
	void show();
	int a = 10;
}
abstract class Abs implements I1 {
	Abs() {
		System.out.println("Abs class Constructor");
	}
	public void show() {
		System.out.println("call show");
	}
}
public class A extends Abs {
	A(){
		System.out.println("A class construcor");
	}
	public static void main(String[] args) {
		// I1 i1 = new I1(); (Creation of Object not Allowed in Interface)
		I1 i = new A();
		i.show();
		System.out.println(I1.a);
	}
}
