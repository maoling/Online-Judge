package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_268 {
	
	public int missingNumber(int[] nums){
		
		int n = nums.length;
		int sum = 0;
		for(int i=0;i<nums.length;i++){
			sum += nums[i];
		}
		return n*(n+1)/2 - sum;
	}
	
	public static void main(String args[]) {
		
		Solution_268 solution = new Solution_268();
		int[] nums = {0,1,2,3,4,5,6,7};
		System.out.println(solution.missingNumber(nums));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

