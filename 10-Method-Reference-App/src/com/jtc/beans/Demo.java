package com.jtc.beans;
import java.util.function.Consumer;

public class Demo {
	
	  public static void main(String[] args) {
		
		Consumer<String> consumer = (s)-> System.out.println(s);
		 
		//Consumer<String>  consumer = (s)-> System.out::println;
		 
         consumer.accept("Sameer");
	}

}
