package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_343 {
	
	 public int integerBreak(int n) {
		  if(n == 2) return 1;
	      if(n == 3) return 2;
	      int[] dp = new int[n+1];
	      dp[2]=2;
	      dp[3]=3;
	      dp[4]=4;
	      for(int i=5;i<=n;i++){
	          dp[i] = dp[i-3] * 3;
	      }
	      return dp[n];	      
	 }
	 
	public static void main(String args[]) {
		
		Solution_343 solution = new Solution_343();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

