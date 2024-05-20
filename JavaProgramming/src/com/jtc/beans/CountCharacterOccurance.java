package com.jtc.beans;

public class CountCharacterOccurance {
	
	   public static void main(String[] args) {
		
		   String str = "Java Programming Java Oops";
		 int total_count =  str.length();//total length
		 int total_countafterremoving =  str.replace("a","").length();
		 System.out.println(total_count-total_countafterremoving);
	}

}
