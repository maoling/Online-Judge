package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_205 {
	//14:05--
	public boolean isIsomorphic(String s,String t){
		if(s.length() != t.length()) return false;	
		Map<Character, Character> map = new HashMap<Character, Character>();
		
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				if(map.get(s.charAt(i)) != t.charAt(i)) return false;							
			}else{
				if(map.containsValue(t.charAt(i))) return false;
				map.put(s.charAt(i),t.charAt(i));
			}
		}
		
		return true;		
	}
	
	public static void main(String args[]) {
		
		Solution_205 solution = new Solution_205();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

