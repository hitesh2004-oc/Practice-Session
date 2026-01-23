package Day25;
import java.util.ArrayList;
import java.util.Iterator;

// Fail Fast Collection
public class P1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		//It is Give us Exception
		//Exception :- ConcurrentModificationException
//		for(Integer i : al) {
//			System.out.println(i);
//			if(i == 100) {
//				al.add(150);
//			}
//		}
//		System.out.println(al);
		
		Iterator<Integer> itr =  al.iterator();
		while(itr.hasNext()) {
			if(itr.next() == 100) {
				itr.remove();
			}
		}
		System.out.println(al);
		
		
	}

}
