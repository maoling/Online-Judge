package com.leetcode;
import java.util.*;
/*
	 *2147483647
	  -1126087180
	  -2147483648
	  126087180
 * */
public class Solution_7 {
	
	public int reverse(int x) {
		  long sum = 0;		
	      while(x != 0){  	    	  
	    	  sum = sum*10+x%10;
	    	  x/=10;	    	  
	      }
	      return (sum >Integer.MAX_VALUE || sum < Integer.MIN_VALUE) ? 0:(int)sum;
	}
	
	
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		Solution_7 solution = null;
		while (cin.hasNext()) {
			solution = new Solution_7();
			n = cin.nextInt(); 
			System.out.println(solution.reverse(n));
			
		}
	}
}

//http://www.importnew.com/17232.html
//https://leetcode.com/problems/reverse-integer/