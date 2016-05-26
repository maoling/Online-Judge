package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_118 {
	
	public List<List<Integer>> generate(int numRows){
		
		List<List<Integer>> biglist = new ArrayList<List<Integer>>();
		if(numRows <= 0)	return biglist;
		
		for(int i=0;i<numRows;i++){
			List<Integer> smalllist = new ArrayList<Integer>();
			smalllist.add(1);	
			for(int j=1;j<i;j++){
				smalllist.add(biglist.get(i-1).get(j-1)+biglist.get(i-1).get(j));
			}	
			if(i > 0) smalllist.add(1);		
			biglist.add(smalllist);		
		}
		
	    return biglist;
	}
	
	public static void main(String args[]) {
		
		Solution_118 solution = new Solution_118();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

