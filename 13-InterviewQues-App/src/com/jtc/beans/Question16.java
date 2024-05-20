package com.jtc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question16 {
	
	   public static void main(String[] args) {
		
		   List<String> list1 = Arrays.asList("Java","8" , "are","Great");
		   List<String> list2 = Arrays.asList("Implementation","In","Java");
		   Stream<String> concatenatedStream =Stream.concat(list1.stream(),list2.stream());
		      List<String> resultList = concatenatedStream.collect(Collectors.toList());
		      System.out.println("ConcatStream::"+resultList);
	}

}
