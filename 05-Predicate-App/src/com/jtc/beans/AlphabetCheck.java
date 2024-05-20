package com.jtc.beans;

import java.util.function.Predicate;

public class AlphabetCheck {
	
	   public static void main(String[] args) {
		   
	String[] names = { "Kajal","Anuskha","Babita","Pallavi","Ankita","Tanya"};
	
	Predicate<String> predicate = (name)->name.startsWith("A");
	 for(String name:names) {
		 if(predicate.test(name)) {
			 System.out.println(name);
		 }
	 }
		
	}

}
