 package com.jtc.beans;

public class MissingNumberinArray {
	
	  public static void main(String[] args) {
		  
		  //Arrays should not have duplicate
		  //No need to be in sorted order
		  //Value should be in range
		  
		  int[] a= {1,2,4,5};
		 // System.out.println(a.length);
		  //1+2+4+5=12  sum1
		  //1+2+3+4+5=15 sum2
		  //sum2-sum1=missing number
		  int sum1 = 0;
		  for(int i=0;i<a.length;i++) {
			  sum1 = sum1+a[i];
		  }
		  System.out.println(sum1);
		  int sum2=0;
		  for(int i=1;i<=5;i++) {
			  sum2 = sum2 + i;
		  }
		  System.out.println(sum2);
		  System.out.println("Missing Number::"+(sum2-sum1));
	}

}
