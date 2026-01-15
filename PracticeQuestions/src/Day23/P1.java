package Day23;
//.....Method Reference.....//
//(1)Reference to a Static Method
//(2)Reference to a Instance Method
//(3)Reference to Constructor

//Using Reference to a Static Method//
interface A{
	public boolean checkSingleDigit(int x);
}
class Digit {
	public static boolean isCheckSingleDigit(int y){
		return y>-10 && y<10;
	}
}

public class P1 {
	public static void main(String[] args) {
		A a1 = Digit::isCheckSingleDigit;
		System.out.println(a1.checkSingleDigit(12));
	}
}
