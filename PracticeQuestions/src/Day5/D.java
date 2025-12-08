package Day5;

//......Nested(Inner) class......//
class Outer {
	void outerLogic() {
		System.out.println("outerLogic Method");
	}
//....Access inner class Approach 1....//
	void accessInner() {
		Inner i1 = new Inner();
		i1.innerLogic();
	}

//......inner class.....//
	class Inner {
		void innerLogic() {
			System.out.println("innerLogic Method");
		}
	}
}
public class D {
	public static void main(String[] args) {
		// ....Access inner class Approach 2....//
		Outer.Inner oi1 = new Outer().new Inner();
		oi1.innerLogic();

		Outer o1 = new Outer();
		o1.accessInner();
		o1.outerLogic();
	}
}
