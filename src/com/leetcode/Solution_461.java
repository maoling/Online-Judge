package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_461 {
	
    public int hammingDistance(int x, int y) {
        int n = x ^ y;
        int count = 0;
        while (n != 0) {       	
        	if ( (n&1) != 0 ) {
        	   count ++ ;
        	}
        	n = n >> 1 ;
        }
    	return count;
    }
	
	public static void main(String args[]) {
		
		Solution_461 solution = new Solution_461();		
		System.out.println(solution.hammingDistance(1 , 4));
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

