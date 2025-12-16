package Day9;
// String - Synchronized, Slow Perfomance, Thread Safe, Immutable
// StringBulider - Not Synchronized, Fast Perfomance, Not Thread Safe, Mutable
// StringBuffer - Not Synchronized,  Slower Perfomance, Thread Safe, Mutable
// Uses of StringBuffer and Increasing Capacity of String Buffer //
// Default Capacity of String Buffer is 16 [byte]
public class P1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		//..Current Capacity is 16../ 
		sb.append("1234567890123456");//Fill all Capacity in String Buffer//
		// sb length is 16 //
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //Capacity - 16//
		
		sb.append("h");
		//(c * 2) + 2 // c[Current Capicity]
		//(16 * 2) + 2
		//(32) + 2 = 34
	    //Total Capacity is = 34
		System.out.println(sb.capacity()); // Capacity - 34
		
		//Giving Capacity to StringBuffer..//
	    //Using ensureCapacity() We can Also give the Capacity for StringBuffer//
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());
		

	}
}
