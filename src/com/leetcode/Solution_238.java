package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_238 {
	public int[] productExceptSelf(int[] nums){
		int[] res = new int[nums.length];
		for(int i=0,tmp=1;i<nums.length;i++){
			res[i] = tmp;
			tmp *= res[i];
		}
		for(int j = nums.length-1,tmp=1;j>=0;j--){
			res[j] *= tmp ;
			tmp *=  res[j];
		}
		return res;	
	}
	
	public static void main(String args[]) {
		
		Solution_238 solution = new Solution_238();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

