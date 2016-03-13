package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_1 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0;i<nums.length;i++){					
			if(hm.containsKey(target-nums[i])){
				result[1] = i;
				result[0] = hm.get(target-nums[i]);
				return result;
			}
			hm.put(nums[i], i);
		}
		return result;       
    }
	
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		Solution_1 solution = new  Solution_1();
		int[] nums ={1, 4,3,5,1,7,8,9};
		int target = 100;
		System.out.println(solution.twoSum(nums, target)[0]+" "+solution.twoSum(nums, target)[1]);
		/*Solution_1 solution = null;
		while (cin.hasNext()) {
			solution = new Solution_1();
			n = cin.nextInt(); 

		}*/
	}
}

