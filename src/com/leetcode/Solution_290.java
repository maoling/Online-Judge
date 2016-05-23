package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_290 {
	//14:05--14:45
	public boolean wordPattern(String pattern,String str){
		
		Map<Character,String> map = new HashMap<Character,String>();
		
		for(int i=0;i<pattern.length();i++){	
			if(map.containsKey(pattern.charAt(i))){
				if(map.get(pattern.charAt(i)) != str.split(" ")[i]) return false;							
			}else{
				if(map.containsValue(str.split(" ")[i])) return false;
				map.put(pattern.charAt(i),str.split(" ")[i]);
			}			
		}
		
		return true;		
	}
	
	public static void main(String args[]) {
		
		Solution_290 solution = new Solution_290();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

