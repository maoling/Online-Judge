package com.leetcode;
import java.util.*;
/*
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 * */
public class Solution_557 {
    
	private String reverseStr(String s) {
		char[] charArr = s.toCharArray();
		for (int i=0;i<charArr.length/2;i++) {
			char temp = charArr[i];
			charArr[i] = charArr[charArr.length-1-i];
			charArr[charArr.length-1-i] = temp;
		}
		return new String(charArr);
	}
	
	public String reverseWords(String s) {
        if (s == null || s.length() == 0) return "";
        String[] strArr = s.split(" ");
        String resStr = "";
        for (int i=0;i<strArr.length;i++) {
        	if (i == 0)  resStr += reverseStr(strArr[i]);
        	else resStr += (" " + reverseStr(strArr[i]));
        }
        return resStr;
    }
	
	public static void main(String args[]) {
		
		Solution_557 solution = new Solution_557();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

