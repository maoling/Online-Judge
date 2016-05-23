package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_38 {
	public String countAndSay(int n){
		String res = "1";
		for(int i=1;i<n;i++){
			res = convert(res);
		}
		return res;
	}
	
	private String convert(String s){
		
		StringBuilder sb = new StringBuilder();
		char[] charArray = s.toCharArray();
		int count = 1;
		char c = charArray[0];
		for(int i=1;i<charArray.length;i++){
			
			if(charArray[i] == c){
				count++;
			}else{
				sb.append(count);
				sb.append(c);
				c = charArray[i];
				count = 1;
			}
		}
		sb.append(count);
		sb.append(c);
		
		return sb.toString();
	}
	
	public static void main(String args[]) {
		
		Solution_38 solution = new Solution_38();
		solution.countAndSay(5);
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

