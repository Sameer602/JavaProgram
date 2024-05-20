 package com.jtc.array;

import java.util.HashSet;

public class RemovingDuplicateElementInArray {
	
	   public static void main(String[] args) {
		
		   int[] a = {1,2,2,3,4,5,5};
		   
		   int[] temp = new int[a.length];
		   int j = 0;
		   for(int i=0;i<a.length-1;i++) {
			     if(a[i]!=a[i+1]) {
			    	 temp[j] = a[i];
			    	 j++;
			     }
		   }
		   temp[j]=a[a.length-1];
		   
		   for(int i=0;i<temp.length;i++) {
			   System.out.println(temp[i]);
		   }
		   /*
		   int a[] = {1,2,2,3,4,5,5};
		   
		   HashSet<Integer> hs = new HashSet<>();
		   
		   for(int i=0;i<a.length;i++) {
			   hs.add(a[i]);
		   }
		   for(int n:hs) {
			   System.out.println(n);
		   }*/
		   
	}

}
