package com.jtc.bean;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
	
	   public static void main(String[] args) {
		
		   Callable callable = new Callable() {
			   public Object call() throws Exception{
				   for(int i=100;i<=120;i++) {
					   System.out.println(i);
					   try {
						   Thread.sleep(5000);
					   }catch(Exception e) {
						   e.printStackTrace();
					   }
				   }
				   return null;
			   }
		   };
		   ExecutorService exService = Executors.newFixedThreadPool(1);
		   exService.submit(callable);
	}

}
