package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodReferenceEx2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(){{
			
			add("Sanjay");
			add("Jatin");
			add("Rohit");
			add("Vinay");
		}};
		
		
		System.out.println("---------------- Method 1 ------------------");
		
		perform(list,MethodReferenceEx2::arg,MethodReferenceEx2::test);
		
		System.out.println("---------------- Method 2 -------------------");
		
		perform(list,p -> true,(p) -> System.out.println(p));
		
		System.out.println("----------------- Method 3 --------------------");
		
		perform(list,MethodReferenceEx2::arg,System.out::println);
		
		
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
		  
	    // collect method returns a set 
	    Set<Integer> squareSet = 
	         numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
	    System.out.println(squareSet); 
	  
	    // demonstration of forEach method 
	    numbers.stream().map(x->x*x).forEach(System.out::println); 
	  
	    // demonstration of reduce method 
	    int even = 
	       numbers.stream().filter(x->x%2==0).reduce(0,(ans , i) -> ans+i); 
	    
	    System.out.println(even);

	    
	    
	    Map<String, List<String>> people = new HashMap<>();
	    people.put("John", Arrays.asList("555-1123", "555-3389"));
	    people.put("Mary", Arrays.asList("555-2243", "555-5264"));
	    people.put("Steve", Arrays.asList("555-6654", "555-3242"));
	    
	    
	    List<String> phones = people.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
	    
	    System.out.println(phones);	
	    
	}

	public static void perform(List<String> list ,Predicate<String> predicate,Consumer<String> consumer)
	{
		for(String  s : list)
		{
			if(predicate.test(s))
				consumer.accept(s);
		}
	}
	
	
	public static void test(String a)
	{
		System.out.println(a);
	}
	
	public static boolean arg(String s)
	{
		return true;
	}
}
