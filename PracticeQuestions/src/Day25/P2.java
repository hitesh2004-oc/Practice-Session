package Day25;

import java.util.concurrent.CopyOnWriteArrayList;

//Fail Safe
public class P2 {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<Integer>();
	    cowal.add(100);
	    cowal.add(200);
	    cowal.add(300);
	    cowal.add(400);
	    
	    for(Integer i : cowal) {
	    	System.out.println(i);
	    	if(i == 100) {
	    		cowal.add(150);
	     	}
	    }
	    System.out.println(cowal);
	}

}
