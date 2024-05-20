package com.jtc.array;

import java.util.Arrays;

public class DeletingElementInArray {
	
	  public static void main(String[] args) {
		
		  int[] a = {10,20,30,60,50,70};
		  int delete = 30;
		  for(int i=0;i<a.length;i++) {
			    if(a[i]==delete) {
			    	  for(int j=i;j<a.length-1;j++) {
			    		  a[j]=a[j+1];
			    	  }
			    	  break;
			    }
		  }
		  for(int i=0;i<a.length-1;i++) {
			  System.out.println(a[i]);
		  }
		
		  
	}

}
