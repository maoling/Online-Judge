package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_217 {
	public boolean containDuplication(int[] nums){
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++){
			if(!set.add(nums[i])) return true;			
		}
		return false;
	}
	
	public static void main(String args[]) {
		
		Solution_217 solution = new Solution_217();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

