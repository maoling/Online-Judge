package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_26 {
	 public int removeDuplicates(int[] nums) {
		if(nums.length == 0)  return 0;
		int j = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i] != nums[j])
				nums[++j] = nums[i];			
		} 
		return ++j;	        
	 }
	 
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		Solution_26 solution = null;
		int[] nums = {1};
		solution = new Solution_26();
		System.out.println(solution.removeDuplicates(nums));
		
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
		
	}
}

