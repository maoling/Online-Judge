package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_136 {
	public int singleNumber(int[] nums){
		int res = 0;
		for(int i=0;i<nums.length;i++){
			 res ^= nums[i];
		}
		return res;
	}
	
	public static void main(String args[]) {
		
		Solution_136 solution = new Solution_136();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

