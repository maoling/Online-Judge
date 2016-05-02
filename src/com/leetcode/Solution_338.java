package com.leetcode;
import java.util.*;


/*

 * */
public class Solution_338 {
	
	public int[] countBits(int num){
		// f[i] = f[i/2] + i%2;
		int f[] = new int[num + 1];
		for(int i=0;i<=num;i++){
			f[i] = f[i>>1] + (i&1);
		}
		return f;
	}
	
	public static void main(String args[]) {
		
		Solution_338 solution = new Solution_338();
		System.out.println(Arrays.toString(solution.countBits(4)));
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

