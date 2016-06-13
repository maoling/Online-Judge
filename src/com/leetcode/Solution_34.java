package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_34 {
	public int[] searchRange(int[] nums,int target){
		int[] res = {-1,-1};
		int start = 0,end = nums.length-1,mid=0,index=0;
		
		while(index < 2 || start <= end){
			
			mid = start + (end-start)/2;
			if(target < res[mid])
				end = mid -1;
			else if(target > res[mid]){
				start = mid + 1;
			}else{
				res[index++] = res[mid];
			}
			
		}
		
		return res;	
	}
	
	public static void main(String args[]) {
		
		Solution_34 solution = new Solution_34();
        System.out.println(Math.pow(2,14));
	}
}

