package com.jtc.beans;

import java.util.Arrays;
import java.util.Collections;

public class Question19 {
	
	   public static void main(String[] args) {
		
		  int[] arr = {10,15,12,21,20,19,26,2};
		  Arrays.sort(arr);
		  Arrays.stream(arr).forEach(n->System.out.println(n+""));
	}

}
