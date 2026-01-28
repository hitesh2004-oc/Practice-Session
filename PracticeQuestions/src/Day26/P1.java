package Day26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class P1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(10);
		list.add(22);
		list.add(31);
		list.add(15);
		list.add(8);
		
		System.out.println(list);
		Stream<Integer> stream = list.stream();
		
		Stream<Integer> streamsort = stream.sorted();
		streamsort.forEach(n ->System.out.println(n));
		
		System.out.println(list);
	}

}
