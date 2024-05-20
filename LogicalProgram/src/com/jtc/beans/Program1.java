package com.jtc.beans;

import java.util.Arrays;
import java.util.List;

public class Program1 {
	
	  public static void main(String[] args) {
		     
		    int[] nums = {1,2,3,4,1};
		  boolean status =  containsDuplicate(nums);
		  System.out.println(status);
	  }
	  public static boolean containsDuplicate(int[] nums) {
		  
		  return Arrays.stream(nums).distinct().count() != nums.length;
		   
	  }
}
