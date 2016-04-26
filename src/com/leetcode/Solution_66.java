package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_66 {
	/*	9999  ---> 10000  
		98-->99 
		45 46 
		99-->100 
		139 140
	*/
	public static int[] plusOne(int[] digits){
		int n = digits.length;
		for(int i=n-1;i>=0;i--){
			if(digits[i] < 9){
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] newArr = new int[n+1];
		newArr[0] = 1;
		return newArr;	
	}
	
	
	public static void main(String args[]) {
		int[] digits = {9,9,9};
		
		System.out.println(Arrays.toString(plusOne(digits)));
		/*Solution_66 solution = new Solution_66();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
			
		}*/
	}
}

