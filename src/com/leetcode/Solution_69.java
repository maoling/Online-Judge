package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_69 {
	public int mySqrt(int x) {
		int i;
        for(i=1;i<=(x/i);++i){
        	System.out.println(i +" "+(x/i));
        }
       
		return i; 
    }
	public static void main(String args[]) {
		
		Solution_69 solution = new Solution_69();
        int a = -16;
		System.out.println(solution.mySqrt(a));;
	}
}

