package com.leetcode;
import java.util.*;
/*
 913
 398
1311
 * */
public class Solution_415 {
	private int char2Int(char c) {
		return c - '0';
	}
	public String addStrings(String num1, String num2) {
		StringBuilder result = new StringBuilder();
		
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
		
	    char[] charArr1 = num1.toCharArray(); 
	    char[] charArr2 = num2.toCharArray();
	    int maxLen = Math.max(charArr1.length, charArr2.length);
	    int carry = 0;
	    for (int i=0;i<maxLen;i++) {
	    	char c1 = (i < charArr1.length) ? charArr1[i] : '0';
	    	char c2 = (i < charArr2.length) ? charArr2[i] : '0';
	    	
	    	int sum = char2Int(c1) + char2Int(c2) + carry;
	    	result.append(sum % 10);
	    	carry = sum / 10;
	    }
	    if (carry != 0) {
	    	result.append(carry);
	    }
	    
	    return result.reverse().toString();
	}
	
	public static void main(String args[]) {
		
		Solution_415 solution = new Solution_415();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

