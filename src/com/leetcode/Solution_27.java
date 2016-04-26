package com.leetcode;
import java.util.*;

import org.omg.CORBA.PUBLIC_MEMBER;
/*

 * */
public class Solution_27 {
	 public static void main(String args[]) {
	   
		Solution_27 solution = new Solution_27();
		int[] nums = {3,2,2,3};
		int val = 3;
		System.out.println(solution.removeElement(nums, val));
		
		for(int i = 0,n=solution.removeElement(nums, val); i<n ;i++){
			System.out.print(nums[i]+" ");
		}
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 			
			
		}*/
	}
	 
	public int removeElement(int[] nums, int val){
		int available = 0;
		for(int i = 0;i<nums.length;i++){
			if(nums[i] != val)
				nums[available++] = nums[i];
		}
		return available;	
	}
}

