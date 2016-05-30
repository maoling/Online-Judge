package com.leetcode;

public class Solution_303_NumArray {
    int numArrays[];
	public Solution_303_NumArray(int[] nums){
		for(int i=0;i<nums.length;i++){
			int sum = 0;	
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

	}

}
