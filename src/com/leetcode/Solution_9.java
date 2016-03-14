package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_9 {
	 public boolean isPalindrome(int x) {
		int rev = 0;
		if(x < 0 || (x!=0 && x%10 == 0)) return false;
		while(x > rev){
			rev = rev * 10 + x%10;
			x/=10;
		}
	    return (x == rev || x == rev/10);
	 }
	
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		Solution_9 solution = null;
		while (cin.hasNext()) {
			solution = new Solution_9();
			n = cin.nextInt(); 
			//System.out.println(Integer.MAX_VALUE);//2147483647
			System.out.println(solution.isPalindrome(n));
			
		}
	}
}

