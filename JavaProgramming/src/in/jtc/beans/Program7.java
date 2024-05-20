package in.jtc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program7 {
	
	  public static void main(String[] args) {
		
		  List<String> list1= Arrays.asList("Java","8","Are");
		  List<String> list2 = Arrays.asList("Explained","through","Program");
		  Stream<String> concatStream = Stream.concat(list1.stream(),list2.stream());
		  concatStream.forEach(System.out::println);
	}

}
