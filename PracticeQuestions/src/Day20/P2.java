package Day20;

//.....Collection FrameWork.......//
//Collection Interface
//List Interface
//ArrayList Class
import java.util.ArrayList;
import java.util.List;

public class P2 {
	public static void main(String[] args) {
        //Non-Generic // Different type [heterogenous Elements]	
		List l = new ArrayList();

		l.add(10);
		l.add("HItesh");	
		l.add(true);
		l.add(null);
		
		System.out.println(l);
	}
}
