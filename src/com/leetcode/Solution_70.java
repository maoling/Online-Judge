package com.leetcode;
import java.util.*;
/*
 * */
public class Solution_70 {
	
	public int climbStairs(int n){
		 if(n<2) return 1;  // n=1,1;n=0;,1
		
		int[] arr = new int[n];
		arr[0] = 1;arr[1]=2;
		for(int i=2;i<n;i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n-1];	
	}
	
	public static void main(String args[]) {
		
		Solution_70 solution = new Solution_70();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

