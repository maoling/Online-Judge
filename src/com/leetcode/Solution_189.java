package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_189 {
	
	public void rotate(int[] nums,int k){
		int n = nums.length;
		reverse(nums,0,n-k-1);
		reverse(nums,n-k,n-1);
		reverse(nums,0,n-1);
	}
	
	private void reverse(int[] nums,int start,int end){
		for(int i=0;i<(end-start+1)/2;i++){
			int tmp = nums[start+i];
			nums[start+i] = nums[end-i];
			nums[end-i] = tmp;
		}
	}
	
	public static void main(String args[]) {
		
		Solution_189 solution = new Solution_189();	
		int[] arr = new int[]{1,2,3,4,5,6,7};
		solution.rotate(arr,4);
		System.out.println(Arrays.toString(arr));
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

