package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_67 {
	public static String addBinary(String a,String b){		
		char[] A = a.toCharArray();
		char[] B = b.toCharArray();	
		StringBuilder sb = new StringBuilder();
	
		int i = A.length-1,j = B.length-1;
		int carry = 0;
		
		while(i>=0 || j>=0){
			int sum = carry;
			if(i >= 0) sum += A[i--]-'0';
			if(j >= 0) sum += B[j--]-'0';
			sb.append(sum % 2);
			carry = sum /2;		
		}
		if(carry != 0) sb.append(carry);		
		
		return sb.reverse().toString();		
	}
	
	public static void main(String args[]) {
		System.out.println(addBinary("111", "101"));
		/*Solution_67 solution = new Solution_67();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

