package com.jtc.practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {
	
	  private static Practice p = null;
	    private Practice() {
	    	
	    }
	    public static Practice getPractice() {
	    	  if(p==null) {
	    		  p = new Practice();
	    	  }
	    	  return p;
	    }
	
	    public static void main(String[] args) {
			
	        	Practice p1 = Practice.getPractice();
	        	System.out.println(p1.hashCode());

	        	Practice p2 = Practice.getPractice();
	        	System.out.println(p2.hashCode());
	        	
		}
}
