package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_350 {
	public int[] intersect(int[] nums1,int[] nums2){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i:nums1){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}else{
				map.put(i, 1);
			}
		}
		
		for(int i:nums2){
			if(map.containsKey(i) && map.get(i) > 0){
				list.add(i);
				map.put(i, map.get(i)-1);
			}
		}
		
		int[] arr = new int[list.size()];
		
		for(int i=0;i<list.size();i++){
			arr[i] = list.get(i);
		}
		
		return arr;
	}
	
	public static void main(String args[]) {
		
		Solution_350 solution = new Solution_350();
		
		System.out.println(Arrays.toString(solution.intersect(new int[]{1,2,2,3}, new int[]{2,2,3,2,2})));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

