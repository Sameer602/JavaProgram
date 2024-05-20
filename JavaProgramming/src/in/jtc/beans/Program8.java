package in.jtc.beans;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program8 {
	
	   public static void main(String[] args) {
		   
		int[] nums = {1,2,3,4,5};
		System.out.println(containsDuplicate(nums));
		
		int[] numsWithDuplicate = {1,2,3,4,5,1};
		System.out.println(containsDuplicate(numsWithDuplicate));
	   }
		public static boolean containsDuplicate(int[] nums) {
			  Set<Integer> set = new HashSet<>();
			  return Arrays.stream(nums)
					        .anyMatch(num->!set.add(num));
			
		}
	

}
