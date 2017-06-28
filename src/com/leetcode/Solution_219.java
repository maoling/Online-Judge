package com.leetcode;
import java.util.*;
/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that 
nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * */
public class Solution_219 {
	//发现i,j之间距离最多不超过k
	public boolean containsNearbyDuplicte(int[] nums,int k){	
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]))  {
				if(i - map.get(nums[i]) <= k)  return true;	
				else map.put(nums[i],i);
			}
			else map.put(nums[i],i);
		}
		return false;	
	}
	
	public static void main(String args[]) {
		
		Solution_219 solution = new Solution_219();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

