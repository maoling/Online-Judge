package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_78_subsets {
	//递归的方法怎么做？
	
	public List<List<Integer>> subsets(int[] nums){
		//位运算 实在是精妙
		List<List<Integer>> allSets = new ArrayList<List<Integer>>();
		int totalnums = 1 << nums.length;
		Arrays.sort(nums);
		for(int i=0;i<totalnums;i++){
			List<Integer> subset = new ArrayList<Integer>();
			for(int j=0;j<nums.length;j++){
				if((i & (1<<j)) != 0)
					subset.add(nums[j]);
			}
			allSets.add(subset);
		}
		return allSets;		
	}
	
	public static void main(String args[]) {
		
		/*
		Solution_78 solution = new Solution_78();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

