package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_220_Q {
	
	// abs(nums[i]-nums[j])<=t and i-j<=k
	public boolean containsNearbyAlmostDuplicte(int[] nums,int k,int t){
		if(nums == null || nums.length==0 || k<=0) return false;
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for(int i=0;i<nums.length;i++){
			Integer floor = set.floor(nums[i]+t);//Returns the greatest key less than or equal to the given ke
			Integer ceil = set.ceiling(nums[i]-t);//Returns the least key greater than or equal to the given key
			if((floor != null && floor>=nums[i]) || (ceil!=null && ceil<=nums[i]) )	return true;
		    set.add(nums[i]);
		    if(i >=k ) 	set.remove(nums[i-k]);
		}
		return false;	
	}
	
	public static void main(String args[]) {
		
		Solution_220_Q solution = new Solution_220_Q();
		int[] nums = {1,2,3,1,4,5}; 
		solution.containsNearbyAlmostDuplicte(nums, 2, 1);
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

