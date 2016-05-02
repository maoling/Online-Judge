package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_326 {
	public boolean isPowerOfThree(int n){	
		
		if(n <= 0) return false;
		while(n %3 == 0)  n /= 3;	
		return n == 1;
	}
	
	public static void main(String args[]) {
		
		Solution_326 solution = new Solution_326();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

