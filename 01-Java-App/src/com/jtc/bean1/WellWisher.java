package com.jtc.bean1;

public class WellWisher {
	
	public static void main(String[] args) {
		Greeting hindi = () -> System.out.println("Namaskar...!!!");
        hindi.greet();
        
        Greeting english = () -> System.out.println("Hello GoodMorning");
        english.greet();
	}
	    
}
