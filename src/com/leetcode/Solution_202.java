package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_202 {
	
	public boolean isHappy(int n){
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(n);
		
		while(n != 1){
			int result = 0;
			while(n != 0){
				result += Math.pow(n%10, 2);
				n /= 10;
			}
			if(set.contains(result))
				return false;
			set.add(result);
			n = result;
		}
		return true;
	}
	
	public static void main(String args[]) {
		
		Solution_202 solution = new Solution_202();
		System.out.println(solution.isHappy(12));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

