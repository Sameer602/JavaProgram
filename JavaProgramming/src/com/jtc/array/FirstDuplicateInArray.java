package com.jtc.array;

public class FirstDuplicateInArray {
	
	  public static void main(String[] args) {
		          
		       int[] a = {6,5,4,6,3,2,2,1,5};
		       
		       for(int i=0;i<a.length;i++) {
		    	   int temp =0;
		    	   for(int j=i+1;j<a.length;j++) {
		    		   if(a[i]==a[j]) {
		    			   System.out.println("First Duplicate Found::"+a[i]);
		    			   temp = temp +1;
		    			   break;
		    		   }
		    	   }
		    	   if(temp>0) {
		    		   break;
		    	   }
		       }
		  }
			  
	  }