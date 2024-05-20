package com.jtc.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
	
	  public static void main(String[] args) {
		
		  LengthOfLongestSubString("abbac");
	}
	public static void LengthOfLongestSubString(String s) {
		
		String longestSubstring = null;
		int longestSubstringLegth=0;
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		      
		  char[] arr = s.toCharArray();
		   for(int i=0;i<arr.length;i++) {
			   char ch = arr[i];
			   if(!map.containsKey(ch)) {
				  map.put(ch, i);
			   }else {
				   i = map.get(ch);
				   map.clear();
			   }
			   if(map.size()>longestSubstringLegth) {
				   longestSubstringLegth=map.size();
				   longestSubstring = map.keySet().toString();
				   
			   }
			 
		   }		
 System.out.println("The longest substring::"+longestSubstring);
 System.out.println("The longest substring length::"+longestSubstringLegth);
	
	}

}
