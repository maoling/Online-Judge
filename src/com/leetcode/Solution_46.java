package com.leetcode;
import java.util.*;
/*
因为这道题！！国仇家恨，宜当奋发图强！
http://blog.csdn.net/bitcarmanlee/article/details/51558272
https://discuss.leetcode.com/topic/41068/my-java-solution-beats-90-javasubmissions-using-2ms
 * */
public class Solution_46 {
	
    public List<List<Integer>> permute(int[] nums) {   	
    	List<List<Integer>> result = new ArrayList<>();
    	permution(result, nums, 0);
    	return result;
    }
    
    private void permution(List<List<Integer>> result, int[] nums, int start) {
    	
    	if (start == nums.length - 1) {
    		result.add(convertArrToList(nums)); 
    	} else {
    		for (int i = start; i<nums.length; i++) {
        		swap(nums, start, i);
        		permution(result,nums,start+1);
        		swap(nums, i, start);
        	}
    	}
    }
    
	private void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}
    
    private List<Integer> convertArrToList(int[] nums) {
    	List<Integer> list = new ArrayList<>();
    	for(int num : nums) {
    		list.add(num);
    	}
    	return list;
    }
    
	public static void main(String args[]) {
		
		Solution_46 solution = new Solution_46();
		solution.permute(new int[]{1, 2, 3});
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

