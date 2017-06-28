package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_561 {
	
    public int arrayPairSum(int[] nums) {
    	List<Integer> list = new ArrayList<>();
    	for (int num : nums) {
    		list.add(num);
    	}
        Collections.sort(list);
        int n = nums.length/2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
        	sum += Math.min(list.get(i*2), list.get(i*2 + 1));
        }
        return sum;
    }
	
	public static void main(String args[]) {
		
		Solution_561 solution = new Solution_561();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

