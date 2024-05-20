package in.jtc.beans;

import java.util.Arrays;

public class Program5 {
	
	  public static void main(String[] args) {		
		  int[] ss = {10,24,56,89,156,178};
		 /* int max = Arrays.stream(ss).max().getAsInt();
		  System.out.println(max);*/
		  Arrays.stream(ss).forEach(System.out::println);
	}

}
