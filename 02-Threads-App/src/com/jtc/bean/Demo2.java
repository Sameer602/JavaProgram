package com.jtc.bean;

public class Demo2 {
	  
	  public static void main(String[] args) {
		
		Runnable runnable =  new Runnable() {
			  public void run() {
				  for(int i=11;i<=20;i++) {
					  System.out.println(i);
				  }
			  }
		  };
		  runnable.run();
	  }
}