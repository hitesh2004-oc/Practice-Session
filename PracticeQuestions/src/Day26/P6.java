package Day26;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//.........Basic Question of stream..........//
public class P6 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 4, 3, 22, 31);
		List<String> ls = new ArrayList<>();
		ls.add("hitesh");
		ls.add("vinod");
		ls.add("");
		ls.add("mohit");
		ls.add("harsh");
		System.out.println(ls);
	    System.out.println(list);
	    
		//(1) List ke sabhi elements print karo using Stream.
	    list.stream().forEach(i->System.out.println(i));
	    System.out.println();
	    
	    //(2)Integer list se even numbers filter karo.
	    list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
	    System.out.println();
		
	    //(3)Integer list se odd numbers filter karo.
	    list.stream().filter(i->i%2!=0).forEach(i->System.out.println(i));
	    System.out.println();
		
	    //(4)String list ko uppercase me convert karo.
	    ls.stream().map(i->i.toUpperCase()).forEach(i->System.out.println(i));
	    System.out.println();
		
	    //(5)String list se empty strings remove karo.
	    ls.stream().filter(i->!i.isEmpty()).forEach(i->System.out.println(i));
	    System.out.println();
		
	    //(6)Integer list ka sum nikaalo using Stream.
	    int sum = list.stream().mapToInt(Integer::intValue).sum();
	    System.out.println(sum);
	    System.out.println();
	
	    //(7)Integer list ka average find karo.
	    double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
	    System.out.println(avg);
	    System.out.println();
	    
	    //(8)List me kitne elements hain (count).
	    long count = list.stream().count();
	    System.out.println(count);
	    System.out.println();
	
	    //(9)List ke distinct elements print karo (distinct).
	    list.stream().distinct().forEach(i->System.out.println(i));
	    System.out.println();
	    
	    //(10)List ko sorted order me print karo.
	    list.stream().sorted().forEach(i->System.out.println(i));
		
	}
}
