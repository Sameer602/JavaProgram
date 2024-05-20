package com.jtc.bean;

public class WellWisher {
	
	public static void wish(Greeting greeting) {
            System.out.println("Hello.......Good Morning");
		greeting.greet();		
	}
	public static void main(String[] args) {
		
		wish(()-> System.out.println("hi......GoodMorning"));
			 				
		wish(new Greeting( ) {    //anonymous implementation
			 public void greet() {
				 System.out.println("Namaskaram");
			 }
		});
	}

}
