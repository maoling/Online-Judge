package com.leetcode;

import java.util.*;
/*

 * */
ublic class Solution_121 {
	//15:00 -- 15:45 (45min)
	public int maxPorfit(int[] prices) {	
		if(prices == null || prices.length == 0)   return  0;
		
		int  max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<prices.length;i++){
			min = Math.min(min, prices[i]);
			max = Math.max(max, prices[i]-min);
		}
		return max;
	}
	
	public static void main(String args[]) {
		
		Solution_121 solution = new Solution_121();
		System.out.println(solution.maxPorfit(new int[]{8,11,6,10}));
		
			
		
	}
}

