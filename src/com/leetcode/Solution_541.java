package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_541 {
    
	private String reverse(String s, int start, int end) {
		char[] charArr = s.toCharArray();
		while (start < end) {
			char tmp = charArr[start];
			charArr[start] = charArr[end];
			charArr[end] = tmp;	
			start ++ ;
			end   --;
		}
		
		return new String(charArr);
	}
	
	public String reverseStr(String s, int k) {
		
		int loop;
		if (s.length() % (2 * k) == 0) {
			loop = s.length() / (2 * k);
		} else {
			loop = s.length() / (2 * k) + 1;
		}
		int t = 0;
		for (int i=0;i<loop;i++) {
			int index = t + k - 1;
			if (index >= s.length())  index = s.length() -1;
		    s = reverse(s,t,index);
		    t += (2*k);
		}
		return s;
    }
	
	public static void main(String args[]) {
		
		Solution_541 solution = new Solution_541();
		
		solution.reverseStr("abcdefg", 2);
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

