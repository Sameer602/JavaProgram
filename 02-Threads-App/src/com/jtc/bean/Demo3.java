package com.jtc.bean;

public class Demo3 {
	
	 public static void main(String[] args) {
		
		 Runnable r = ()-> {
			 for(int i=21;i<=30;i++) {
				 System.out.println(i);
			 }
		 };
		// r.run();
		 Thread t = new Thread(r);
		 t.start();
	}

}
