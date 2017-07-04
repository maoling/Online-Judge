package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_485 {
	
    public int findMaxConsecutiveOnes(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nums.length; i++) {       	
            sb.append(nums[i]);       	
        }
        String[] strArr = sb.toString().split("0");
        int maxLen = 0;
        for (int i = 0; i < strArr.length; i++) {
        	if(strArr[i].length() > maxLen) {
        		maxLen = strArr[i].length();
        	}
        }
        return maxLen;
    }
	
	public static void main(String args[]) {
		
		Solution_485 solution = new Solution_485();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

