package com.jtc.string;
 
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupsChars {
	
	    public static void main(String[] args) {
			
	    	String str = "programming";
	    	
	    	//Appraoch-1	    	
	    /*	StringBuilder sbd = new StringBuilder();
	    	str.chars().distinct().forEach(c->sbd.append((char)c));
	    	System.out.println(sbd);*/
	    	//Approach-2
	    	
	    	StringBuilder sbd = new StringBuilder();
	    	for(int i=0;i<str.length();i++) {
	    		  char ch = str.charAt(i);
	    		int idx =  str.indexOf(ch, i+1);
	    		if(idx==-1) {
	    			sbd.append(ch);
	    		}	    		
	    	}
	    	System.out.println(sbd);
	    	//Approach-3
	    	  char[] arr = str.toCharArray();
	    	  StringBuilder sb1 = new StringBuilder();
	    	  for(int i=0;i<arr.length;i++) {
	    		   boolean repeated = false;
	    		   for(int j=i+1;j<arr.length;j++) {
	    			   if(arr[i]==arr[j]) {
	    				   repeated=true;
	    				   break;
	    			   }
	    		   }
	    		  if(!repeated) {
	    			  sb1.append(arr[i]);
	    		  }
	    	  }
	    	  System.out.println(sb1);
	    	  
	    	  //Approach-4
	    	  StringBuilder sb2 = new StringBuilder();
	    	  Set<Character> set = new LinkedHashSet<>();
	    	  for(int i=0;i<str.length();i++) {
	    		  set.add(str.charAt(i));
	    	  }
	    	  for(Character c:set) {
	    		  sb2.append(c);
	    	  }
	    	  System.out.println(sb2);
		}
	    

}
