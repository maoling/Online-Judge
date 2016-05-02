package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_342 {
	public boolean isPowerOfFour(int num){
		return  num>0 && (num&(num-1))==0 &&((num&0x55555555)!=0) ;	
	}
	public static void main(String args[]) {
		
		Solution_342 solution = new Solution_342();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

