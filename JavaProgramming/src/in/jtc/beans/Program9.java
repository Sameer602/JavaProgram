package in.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Program9 {
	
	public static void main(String[] args) {
		
		
    	String input = "AABCDBE" ;
    	for(int i=0;i<input.length();i++) {
    		boolean unique = true;
    		for(int j=0;i<input.length();j++) {
    			 if(i != j && input.charAt(i)==input.charAt(j)) {
    				 unique = false;
    				 break;
    			 }
    		}
    		if(unique) {
    			System.out.println(input.charAt(i)); 
    			break;
    		}
    		
    	}
	}

}
