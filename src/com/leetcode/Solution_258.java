package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_258 {
	
	public int addDigits(int num){
		return num>9?(num%9==0?9:num%9):num;
	}
	
	public static void main(String args[]) {
		
		Solution_258 solution = new Solution_258();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

