package Day26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class P7 {
	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1,2,2,3,6,4,5);
		List<Integer> listSum = ls.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(listSum);
		
		int max = ls.stream().max(Integer::compare).orElseThrow();
		System.out.println(max);
		
		List<Integer> sor = ls.stream().sorted().collect(Collectors.toList());
		System.out.println(sor);
		
		List<String> names = Arrays.asList("Alice", "Bob", "Annie",null ,"Alex", "Charlie");
		
//		long count = names.stream().filter(i -> i.startsWith("A")).count();
//		System.out.println(count);
		
		OptionalDouble avg = ls.stream().mapToInt(Integer::intValue).average();
		System.out.println(avg);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicates = numbers.stream()
		    .filter(n -> !unique.add(n))
		    .collect(Collectors.toSet());
		System.out.println(duplicates);
		
		System.out.println(ls.stream().reduce((a, b) -> a>b?a:b).orElse(0));
		
		
		List<String> rem = names.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(rem);
		
	}

}
