package in.jtc.beans;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program2 {
	
	  public static void main(String[] args) {
		
		  String str = "Programming";
		  String[] ss = str.split("");
		  Set<String> set = new LinkedHashSet<>();
		  LinkedHashMap<String, Long> collect = Arrays.stream(ss).map(String::toLowerCase)
		               .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())
		         		);
		  System.out.println(collect);
		  Optional<Entry<String, Long>> findFirst = collect.entrySet().stream().filter(k->k.getValue()==1).findFirst();
		  System.out.println(findFirst);
	}
}
