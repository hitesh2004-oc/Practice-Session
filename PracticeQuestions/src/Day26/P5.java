package Day26;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//.........Map Question........//
public class P5 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 4, 3, 22, 31, -2);
		List<String> ls = new ArrayList<>();
		ls.add("hitesh");
		ls.add("vinod");
		ls.add("");
		ls.add("ajay");
		ls.add("mohit");
		ls.add("harsh");
	    System.out.println(list);
	    
	    //(1)Integer list se numbers > 10 filter karo.
	    list.stream().filter(i -> i>10).forEach(i -> System.out.println(i));
	    System.out.println();
	
	    //(2)Integer list ke square find karo.
	    list.stream().map(i->i*i).forEach(i->System.out.println(i));
	    System.out.println();
	    
	    //(3)String list me se length > 5 wale words print karo.
	    ls.stream().filter(i->i.length()>5).forEach(i->System.out.println(i));
	    System.out.println();
	
	    //(4)String list me se "a" se start hone wale words print karo.
	    ls.stream().filter(i->i != "" && i.charAt(0) == 'a').forEach(i->System.out.println(i));
	    System.out.println();
		
	    //(5)Integer list me se negative numbers remove karo.
	    list.stream().filter(i->i>=0).forEach(System.out::println);
	    System.out.println();
	
	    //(6)Employee list me se salary > 50,000 filter karo.
	    List<Integer> Employee = new ArrayList<>();
	    Employee.add(20000);
	    Employee.add(35000);
	    Employee.add(80000);
	    Employee.add(77000);
	
	    Employee.stream().filter(i->i>50000).forEach(System.out::println);
	    System.out.println();
	    
	    //(7)Product list me se price < 1000 wale products print karo.
	    List<Integer> Product = new ArrayList<>();
	    Product.add(3000);
	    Product.add(500);
	    Product.add(1500);
	    Product.add(770);
	    
	    Product.stream().filter(i->i<1000).forEach(System.out::println);
	    System.out.println();
	    
	    //(8)String list ko length ke basis par map karo.
	    ls.stream().map(i->i.length()).forEach(System.out::println);
	    System.out.println();
	
	    //(9)Integer list ke double value generate karo.
	    list.stream().map(i->i*2).forEach(System.out::println);
	    System.out.println();
		
	    //(10)List ke elements par custom calculation lagao using map().
	    list.stream().map(i->i+3*3-2).forEach(System.out::println);
		
	    
	}
}
