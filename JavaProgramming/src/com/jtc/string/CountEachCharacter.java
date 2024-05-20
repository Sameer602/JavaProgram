package com.jtc.string;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacter {
	
	  public static void main(String[] args) {
		
	         String input = "Hello";
	         
	     char[] chars =   input.toCharArray();
	     Map<Character,Integer> map = new HashMap<>();
	     for(char ch : chars) {
	    	   if(!map.containsKey(ch)) {
	    		     map.put(ch, 1);
	    	   }else {
	    		 int count =  map.get(ch);
	    		 map.put(ch,count+1);
	    	   }
	     }
	     System.out.println(map);
	}

}
