package com.jtc.string;

public class ReverseString {
	
	  public static void main(String[] args) {
		
		  String str = "Hello";
		 
		    int length = str.length();
		    /*
		    System.out.println(length);
		         char[] cs = str.toCharArray();
		         for(int i=cs.length-1;i>=0;i--) {
		        	 System.out.print(cs[i]);*/
		         	         
		  /*
		    StringBuilder sb = new StringBuilder(str);
		      StringBuilder reverse = sb.reverse();
		      System.out.println(reverse);*/
	          String reverse = "";
	         for(int i= str.length()-1;i>=0;i--) {
	        	 reverse = reverse + str.charAt(i);
	        	 
	         }
	         System.out.println(reverse);
	}

}
