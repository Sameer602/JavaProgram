package com.jtc.array;

import java.util.HashSet;

public class CommonElementFromTwoArray {
	
	  public static void main(String[] args) {
		  /*
		  int arr1[] = {4,3,7,9,8,5};
		  int arr2[] = {1,2,4,5,6,12};
		  HashSet<Integer> hs = new HashSet<>();
		  
		  for(int i=0;i<arr1.length;i++) {
			     for(int j=0;j<arr2.length;j++) {
			    	 if(arr1[i]==arr2[j]) {
			    		 hs.add(arr1[i]);
			    	 }
			     }
		  }
		  System.out.println("Common Element From Two Arrays are::");
		  for(int n:hs) {
			  System.out.println(n);
		  }*/
		  /*
		  int arr1[] =  {4,3,7,9,2};
		  int arr2[] =  {5,1,4,8,3};
		  HashSet<Integer> hs = new HashSet<>();
		      for(int no:arr1) {
		    	  hs.add(no);
		      }
		      for(int no:arr2) {
		    	boolean b = hs.add(no);
		    	if(b==false) {
		    		System.out.println(no);
		    	}
		      }	*/
		  int arr1[] =  {4,3,7,9,2,4};
		  int arr2[] =  {5,1,4,8,3,5};
		  
		  HashSet<Integer> hs1 = new HashSet<>();
		  HashSet<Integer> hs2 = new HashSet<>();
		  
		  for(int no:arr1) {
			  hs1.add(no);
		  }
		  for(int no:arr2) {
			  hs2.add(no);
		  }
		  for(int no:hs2) {
			boolean b =  hs1.add(no);
			if(b==false) {
				System.out.println(no);
			}
		  }
		  
		  
	}

}
