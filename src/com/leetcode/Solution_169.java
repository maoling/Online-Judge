package com.leetcode;
import java.util.*;

import javax.sound.midi.Soundbank;
/*

 * */
public class Solution_169 {
	//Moore voting algorithm
	
	public int majorityElement(int[] nums){
		int major = 0,count = 0;
		for(int i=0;i<nums.length;i++){
			if(count == 0){
				count++;
				major = nums[i];
			}else if(nums[i] == major)
				count++;
			else
				count--;			
		}		
		return major;		
	}
	
	public static void main(String args[]) {
		
		Solution_169 solution = new Solution_169();
		int[] arr = {4,1,4,2,4,3,4};//1,2,1,2,1,2,1
		System.out.println(solution.majorityElement(arr));
		
		/*
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

