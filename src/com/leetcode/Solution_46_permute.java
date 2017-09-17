package com.leetcode;
import java.util.*;
/*
��Ϊ����⣡������Һޣ��˵��ܷ�ͼǿ��
http://blog.csdn.net/bitcarmanlee/article/details/51558272
https://discuss.leetcode.com/topic/41068/my-java-solution-beats-90-javasubmissions-using-2ms
ȫ���й���n!�ֿ��ܡ�ÿ��ѡȡһ��Ԫ����Ϊ��ʼ�ĵ�һ��Ԫ�أ�Ȼ�����ʣ���Ԫ��ȫ���С�����ͬ�ϣ�����һ���ݹ�
 * */
public class Solution_46_permute {
	
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
        		//�����û�ԭλ
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
		
		Solution_46_permute solution = new Solution_46_permute();
		solution.permute(new int[]{1, 2, 3});
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

