package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_219 {
	//发现i,j之间距离最多不超过k
	public boolean containsNearbyDuplicte(int[] nums,int k){	
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i]))  {
				if(i - map.get(nums[i]) <= k)  return true;				
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

