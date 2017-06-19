package com.leetcode;
import java.util.*;
/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer¡¯s binary representation.
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 * */
public class Solution_476 {
	
	public int findComplement(int num) {
		// return num ^ 0xffffffff;
		int sum = 0;
		int index = 0;
		while (num != 0) {
			int n = num & 1;
			sum += ((1 - n) * Math.pow(2, index++));
			num >>= 1;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		
		Solution_476 solution = new Solution_476();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

