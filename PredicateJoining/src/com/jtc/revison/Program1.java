package com.jtc.revison;

import java.util.ArrayList;

public class Program1 {

	   public static void main(String[] args) {
		
	        int[]  a = {5,3,4,2,3,4,5};
	        int res = 0;
	        for(int i=0;i<a.length;i++) {
	        	res = res^a[i];
	        }
	        System.out.println(res);
	}
}
