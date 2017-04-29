package com.leetcode;

/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * */
public class Solution_53 {
	
    public int maxSubArray(int[] nums) {
       int sum = 0;
       int max = Integer.MIN_VALUE;
       //-2,1,-3,4,-1,2,1,-5,4
       for (int i=0;i<nums.length;i++) {
    	   sum += nums[i];  	   
    	   if (sum > max) {
    		   max = sum;
    	   }
    	   if (sum < 0) {
    		   sum = 0;
    	   }
    	   
       }
       return max;
    }
	
	public static void main(String args[]) {
		
		Solution_53 solution = new Solution_53();
		solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

