package com.jtc.beans;

import java.util.function.Predicate;

public class CharacterCheck {
	
	  public static void main(String[] args) {
		
	 Predicate<String> predicate = (character) -> character.length()>7;
	   System.out.println(predicate.test("SameerRai"));
	  System.out.println( predicate.test("Ram"));
	}

}
