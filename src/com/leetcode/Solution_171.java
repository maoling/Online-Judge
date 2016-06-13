package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_171 {
	
	public int titleToNumber(String s) {
		int[] arr = new int[s.length()];
		int res = 0;
		for(int i=0;i<s.length();i++)
			arr[i] = s.charAt(i)-64;
		
		for(int i=0;i<s.length();i++)
		    res = (int) (res + arr[i] * Math.pow(26, s.length()-1-i));
		return res;
		/*StringBuilder sb = new StringBuilder();
		while(n != 0){
			if(n%26 == 0){
				sb.append('Z');
				n /= 26;
				n--;
			}else{
			  sb.append((char)(n%26+64));
			  n /= 26;
			}
		}
		return sb.reverse().toString();*/
	}
	
	public static void main(String args[]) {
		
		Solution_171 solution = new Solution_171();
		System.out.println(solution.titleToNumber("A"));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

