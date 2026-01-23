package Day13;

public class P3 {
	public static void main(String[] args) {
		try {
			System.out.println("try bloack");
			System.exit(0);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally bloack");
		}
	}

}
