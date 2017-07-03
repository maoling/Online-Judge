package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_520 {
	
    public boolean detectCapitalUse(String word) {
    	if (word == null || word.length() == 0) return false;
        char[] charArr = word.toCharArray();
        int count = 0;
    	for (int i = 0; i < charArr.length; i++) {
        	if (Character.isLowerCase(charArr[i])) {
        		count++;
        	}
        }
    	if (count == 0 || count == word.length()) {
    		return true;
    	}
    	if (count == word.length() - 1) {
    		return Character.isUpperCase(charArr[0]);
    	}
    	return false;
    }
    
	public static void main(String args[]) {
		
		Solution_520 solution = new Solution_520();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

