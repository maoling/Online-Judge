package com.leetcode;
import java.util.*;
/*
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question.

 * */
public class Solution_287 {
	
	public static void main(String args[]) {
		
		Solution_287 solution = new Solution_287();		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 			
			
		}*/
	}
	/**
	 * [2,2,3,2]  2
       [1,2,3,2]  2
	 * @param nums
	 * @return
	 */
    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
        	sum += nums[i];
        }
        return sum - (1 + n) * n/2; 
    }	
}

