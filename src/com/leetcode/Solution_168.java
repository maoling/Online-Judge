package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_168 {
	
	public String convertToTitle(int n){
		StringBuilder sb = new StringBuilder();
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
		return sb.reverse().toString();
	}
	
	public static void main(String args[]) {
		
		Solution_168 solution = new Solution_168();
		System.out.println(solution.convertToTitle(100));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

