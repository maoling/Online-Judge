package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_137 {
	
	public int singleNumber(int[] nums){
		int ans = 0;
		for(int i=0;i<32;i++){
			int sum = 0;
			for(int j=0;j<nums.length;j++){
				if( ((nums[j] >> i)&1) == 1 ){
					sum++;
					sum %= 3;
				}
			}			
			if(sum != 0){
				ans |= sum << i;
			}
		}
	
		return ans;		
	}
	
	public static void main(String args[]) {
		
		Solution_137 solution = new Solution_137();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

