package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_278 {
	
	public int firstBadVersion(int n){
		/*why error
		int begin =0,end = n-1;
	    while(begin <= end){
	    	int mid = begin + (end-begin)/2;
	    	if(!isBadVersion(mid)) begin = mid +1;
	    	else end = mid;
	    }
	    return begin;
        */
        int begin =1,end = n;
	    while(begin < end){
	    	int mid = begin + (end-begin)/2;
	    	if(!isBadVersion(mid)) begin = mid +1;
	    	else end = mid;
	    }
	    return begin;

		
	}
	private boolean isBadVersion(int n){
		return false;
		
	}
	public static void main(String args[]) {
		
		Solution_278 solution = new Solution_278();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

