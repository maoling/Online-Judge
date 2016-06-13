package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_318 {
	
	public int maxProduct(String[] words){
		List<String> list = new ArrayList<String>();
		for(String w: words){
			list.add(w);
		}
		
		Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}				
		});
        
		int mid = list.size()/2;
		
		while(start < end){
			
			
			
		}			
	 }
	
	public static void main(String args[]) {
		
		Solution_318 solution = new Solution_318();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

