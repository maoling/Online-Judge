package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_190 {
	
	public static int reverseBits(int n){
		long result = 0;
		for(int i=0;i<32;i++){
			result += Math.pow(2, 31-i) *(n&1);
			n >>= 1;
		}
		
		return (int)result;	
	}
	
	public static void main(String args[]) {
		System.out.println(reverseBits(0));
		/*Solution_190 solution = new Solution_190();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

