package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_349 {
	public int[] intersection(int[] num1,int[] num2){
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i:num1)     set1.add(i);
		for(int i:num2){
			if(set1.contains(i))	set2.add(i);
		}
		int[] res = new int[set2.size()];
		int index = 0;
		for(int i:set2){
			res[index++] = i;
		}
		return res;
	}
	
	public static void main(String args[]) {
		
		Solution_349 solution = new Solution_349();		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

