package Day26;

// Annonymous Inner Class

interface Car{
	void drive(); //public abstract
}
public class P4 {
	public static void main(String[] args) {
		Car c = () -> System.out.println("drive......");
	    c.drive();
	}
}
