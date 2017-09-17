package com.leetcode;

public class Solution_303_NumArray {
    int[] numArrays;
	public Solution_303_NumArray(int[] nums){
		numArrays = new int[nums.length];//error
		int sum = 0;//error
		for(int i=0;i<nums.length;i++){				
			sum += nums[i];
			numArrays[i] = sum;
			
		}			
	}
	
	public int sumRange(int i,int j){
		if(i == 0) return numArrays[j];
		return numArrays[j] - numArrays[i-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Your NumArray object will be instantiated and called as such:
		 int[] nums = {-2,0,3,-5,2,-1};
		 Solution_303_NumArray numArray = new Solution_303_NumArray(nums);
		 System.out.println(numArray.sumRange(0,2));
		 System.out.println(numArray.sumRange(2,5));
		 System.out.println(numArray.sumRange(0,5));
		 
	}

}
