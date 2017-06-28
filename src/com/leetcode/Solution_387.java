package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_387 {
	
	public int firstUniqChar(String s) {
	    char[] charArr = s.toCharArray();
	    Map<Character,Integer> map = new HashMap<>();
	    for(int i=0;i<charArr.length;i++) {
	    	if (map.containsKey(charArr[i])) {	    		
	    		map.put(charArr[i],map.get(charArr[i])+1);
	    	} else {
	    		map.put(charArr[i], 1);
	    	}	    
	    }  
        for(int i=0;i<charArr.length;i++) {
	    	if (map.get(charArr[i]) == 1) {
	    		return i;
	    	}
	    }
        return -1;
	}
	
	public static void main(String args[]) {
		
		Solution_387 solution = new Solution_387();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

