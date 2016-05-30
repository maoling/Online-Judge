package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_165 {
	
	public int compareVersion(String version1,String version2){
		int a = Integer.parseInt(version1.split(".")[0]);
		int b = Integer.parseInt(version1.split(".")[1]);
		int c = Integer.parseInt(version2.split(".")[0]);
		int d = Integer.parseInt(version2.split(".")[1]);	
		
		if(a < c) return -1;
		else if(a > c) return 1;
		else{
			if(b < d) return -1;
			else if(b > d) return 1;
			else return 0;
		}
		
	}
	
	public static void main(String args[]) {
		
		Solution_165 solution = new Solution_165();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

