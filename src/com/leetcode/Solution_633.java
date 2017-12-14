package com.leetcode;
import java.util.*;

/*


 * */


public class Solution_633 {
	
    public boolean judgeSquareSum(int c) {
        
    	int left = 0, right = (int)Math.sqrt(c);
    	
    	while (left <= right) {
    		int tmp = left * left + right * right;
    		if (tmp == c) 
    			return true;
    		if (tmp < c)
    			left ++;
    		if (tmp > c)
    			right--;   			
    	}  	
    	return false;
    }
	
	public static void main(String args[]) {
		
		Solution_633 solution = new Solution_633();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

