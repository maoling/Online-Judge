package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_191 {
	public int  hammingWeight(int n){
		int count = 0;
		while(n != 0){
			n = n & (n-1);
			count ++;
		}
		return count;
	}
	public static void main(String args[]) {
		
		   float f=42.0f;
		   float f1[]=new float[2];
		   float f2[]=new float[2];
		   float[] f3=f1;
		   long x=42;
		   f1[0]=42.0f;
		   System.out.println(x == f1[0]);
		/*Solution_191 solution = new Solution_191();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

