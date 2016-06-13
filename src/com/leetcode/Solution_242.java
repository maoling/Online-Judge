package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_242 {
	
    public boolean isAnagram(String s, String t) {
    	Map<Character,Integer> hashMap = new HashMap<Character, Integer>();
    	for(char c:s.toCharArray()){
    		if(hashMap.containsKey(c)){
    			hashMap.put(c, hashMap.get(c)+1);
    		}else{
    			hashMap.put(c, 1);
    		}
    	}
    	for(char c:t.toCharArray()){
    		if(!hashMap.containsKey(c)) return false;
    		else{
    			if(hashMap.get(c) > 1){
    				hashMap.put(c, hashMap.get(c)-1);
    			}else{
    				hashMap.remove(c);
    			}
    		}
    		
    	}
    	
		return hashMap.size() == 0;   
    }
	
	public static void main(String args[]) {
		
		Solution_242 solution = new Solution_242();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

