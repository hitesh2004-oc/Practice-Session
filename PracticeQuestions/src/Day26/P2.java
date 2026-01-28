package Day26;

import java.util.Arrays;
import java.util.List;

// ForEach - consumer type
// filter - Predicate type
public class P2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 34, 90, 3, 4);
		System.out.println(list);
		
		list.stream().filter(i -> i%2 == 0).forEach(i -> System.out.println(i));
		System.out.println(list);
		
	}
}
