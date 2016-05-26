package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_290 {
	//14:05--14:45
	public boolean wordPattern(String pattern,String str){
		if(pattern.length() != str.split(" ").length)  return false;
		
		Map<Character,String> map = new HashMap<Character,String>();
		
		for(int i=0;i<pattern.length();i++){	
			if(map.containsKey(pattern.charAt(i))){
				if(!map.get(pattern.charAt(i)).equals(str.split(" ")[i])) 					
					return false;										
			}else{
				if(map.containsValue(str.split(" ")[i])) return false;
				map.put(pattern.charAt(i),str.split(" ")[i]);
			}			
		}
		
		return true;		
	}
	
	public static void main(String args[]) {
		/*
		 * pattern = "abba", str = "dog cat cat dog" should return true.
			pattern = "abba", str = "dog cat cat fish" should return false.
			pattern = "aaaa", str = "dog cat cat dog" should return false.
			pattern = "abba", str = "dog dog dog dog" should return false.
		 * */
		Solution_290 solution = new Solution_290();
		System.out.println(solution.wordPattern("abc", "dog cat"));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

