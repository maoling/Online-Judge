package com.leetcode;
import java.util.*;


/*

 * */
public class Solution_347 {
	
    public List<Integer> topKFrequent(int[] nums, int k) {
    	
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int num : nums){
        	if(map.containsKey(num))
        		map.put(num,map.get(num)+1);
        	else
        		map.put(num, 1);       	
        }
        
      List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
      //然后通过比较器来实现排序
      Collections.sort(list,new Comparator<java.util.Map.Entry<Integer, Integer>>() {
	      //降序排序
	      public int compare(java.util.Map.Entry<Integer, Integer> o1,java.util.Map.Entry<Integer, Integer> o2) {
	      return o2.getValue().compareTo(o1.getValue());
	      }
      });
      
      List<Integer> ret = new ArrayList<Integer>();
      for(int i=0;i<k;i++){
    	  ret.add(list.get(i).getKey());
      }
      return ret;
    }
	public static void main(String args[]) {
		
		Solution_347 solution = new Solution_347();
		
		System.out.println(solution.topKFrequent(new int[]{1,1,1,2,2,3,3,3}, 2).toString());
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

