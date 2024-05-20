package com.jtc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program6 {
	
	   public static void main(String[] args) {
		
		   List<String> list1 = Arrays.asList("Java","8","Articles");
		   List<String> list2 = Arrays.asList("explained","through","Programs");
		   Stream<String> concatStream = Stream.concat(list1.stream(),list2.stream());
		      concatStream.distinct()
		                .collect(Collectors.toList())
		                 .forEach(System.out::println);
	}

}
