package in.jtc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program4 {
	
	  public static void main(String[] args) {
		
		  String str = "Engineering";
		  String[] ss = str.split("");
	List<String> nameList = Arrays.stream(ss)
			.map(String::toUpperCase)
		              .collect(Collectors.toList());
	  System.out.println(nameList);
	}

}
