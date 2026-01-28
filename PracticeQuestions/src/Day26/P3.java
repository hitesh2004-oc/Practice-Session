package Day26;

import java.util.Arrays;
import java.util.List;

//Map - Function type return 
public class P3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 34, 90, 3, 4);
		System.out.println(list);
		
		list.stream().map(n -> n*n).forEach(i -> System.out.println(i));
		System.out.println(list);
		//Lambda Expression
		list.stream().filter(i -> i%2==0).map(n -> n*n).forEach(n -> System.out.println(n));
		System.out.println(list);
		
		//Method Reference
		list.stream().filter(i -> i%2==0).map(n -> n*n).forEach(System.out::println);
		System.out.println(list);
		
		//Distinct Method
		list.stream().distinct().forEach(System.out::println);
		System.out.println(list);
		
		//limit method
		list.stream().limit(3).forEach(System.out::println);
		System.out.println(list);
		
		//skip method 
		list.stream().skip(3).forEach(System.out::println);
	}
}
