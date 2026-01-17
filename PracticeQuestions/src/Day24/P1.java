package Day24;

import java.util.ArrayList;

public class P1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(10));
		System.out.println(al.getFirst());
		System.out.println(al.remove(9));
		Object obj = al.clone();
		System.out.println(obj);
	}

}
