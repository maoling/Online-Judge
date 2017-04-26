package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_541 {
    
	private String reverse(String s, int start, int end) {
		char[] charArr = s.toCharArray();
		for (int i=start; i < (end-start+1)/2; i++) {
			char tmp = charArr[i];
			charArr[i] = charArr[end-start-i];
			charArr[end-start-i] = tmp;			
		}
		return new String(charArr);
	}
	
	public String reverseStr(String s, int k) {
		if (s.length() < k) return reverse(s, 0, s.length());
		if (s.length() >= k && s.length() < 2*k) return reverse(s, 0, k-1);
		int loop;
		if (s.length() % (2 * k) == 0) {
			loop = s.length() / (2 * k);
		} else {
			loop = s.length() / (2 * k) + 1;
		}
    }
	
	public static void main(String args[]) {
		
		Solution_541 solution = new Solution_541();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

