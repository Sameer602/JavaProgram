package in.jtc.beans;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	
	  public static void main(String[] args) {
		
		BiConsumer<String,String> bic =  (arg1,arg2)->{
			  System.out.println("Hi, I am "+ arg1);
			  System.out.println("Hello I am from"+ arg2);
		  };
		  bic.accept("Sameer", "Khalilabad");
	}

}
