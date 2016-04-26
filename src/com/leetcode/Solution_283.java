package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_283 {
	public static void moveZeroes(int[] nums){
		int start = 0;
		for(int i=0 ;i<nums.length;i++){
			if(nums[i] != 0)
				nums[start++] = nums[i];
		}
		for(int i=start;i<nums.length;i++)
			nums[i] = 0;
	}
	public static void main(String args[]) {
		int[] nums = {0,0,0,0};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
		
		
		/*Solution_283 solution = new Solution_283();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

