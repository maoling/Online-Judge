package com.leetcode;
import java.util.*;


public class Solution_231 {
	public boolean isPowerTwo(int n){
		return ( ((n&(n-1))== 0) &&  n > 0 );
	}
	
	public static void main(String args[]) {
		
		Solution_231 solution = new Solution_231();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}
	}
}

