package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_165 {
	
	public int compareVersion(String version1,String version2){
		
		//double a = Double.parseDouble(version1); // error: no with \\;
		//double b = Double.parseDouble(version2);
		//int c = Integer.parseInt(version2.split("\\.")[0]);
		//int d = Integer.parseInt(version2.split("\\.")[1]);
		
		String[] strArray1 = version1.split("\\.");
		String[] strArray2 = version2.split("\\.");
		
		int len = Math.max(strArray1.length, strArray2.length);
		
		for(int i=0;i<len;i++){
			Integer v1 = i<strArray1.length ? Integer.parseInt(strArray1[i]):0; 
			Integer v2 = i<strArray2.length ? Integer.parseInt(strArray2[i]):0;
		    if(v1 < v2) return -1;
		    if(v1 > v2) return 1;
		}		
		return 0;

	}
	
	public static void main(String args[]) {
		
		// error: "0.1"--->"0.0.1"   0.1 < 1.1 < 1.2 < 13.37
		Solution_165 solution = new Solution_165();
		System.out.println(solution.compareVersion("1.1","1.1.2"));
		
	}
}

