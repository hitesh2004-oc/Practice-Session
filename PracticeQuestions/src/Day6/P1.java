package Day6;
//........Using ENUM in Java.......//
enum Courses{
	PYTHON, JAVA , DEVOPS;
}

public class P1 {
	enum WEEKEND{
		SATURDAY, SUNDAY;
	}
	public static void main(String[] args) {
		//........Multiple Value Access.......//
		Courses[] val = Courses.values();
		
		for(Courses i : val) {
			System.out.println(i);
		}
		
		//........Single Value Access........//
		System.out.println(WEEKEND.SATURDAY);
	}

}
