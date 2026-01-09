package Day20;

//.....Collection FrameWork.......//
//Collection Interface
//List Interface
import java.util.ArrayList;
import java.util.Vector;

public class P3 {
	public static void main(String[] args) {
        //Generic // Different type [Homogenous Elements]	
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.get(4));
//[Error - Because Generic Type Integer and Homogenous Elements]//
	    //al.add("hitesh"); 
		
		Vector v = new Vector();
		//Vector Default Capacity(10)
		System.out.println(v.capacity());
		//Array and Vector Both are Some
		//Array - Fix Size(Capacity)(Static)
		//Vector - Dynamic Capacity(Size)
		/*Calculate the Vector Capacity
		 * (cc[currCapacity]*3/2)+1
		 */
		
	
	}

}
