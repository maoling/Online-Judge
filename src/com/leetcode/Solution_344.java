package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_344 {
	
	public String reverseString(String s){
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	public static void main(String args[]){
		
		Solution_344 solution = new Solution_344();
		System.out.println(solution.reverseString("h el lo "));
		
	}
}

