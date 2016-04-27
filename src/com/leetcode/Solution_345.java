package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_345 {
	public String reverseVowels(String s) {
		
		HashSet<Character> set = new HashSet<Character>();
		set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
		set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
		char[] cArray = s.toCharArray();
		int len = cArray.length;
		int i=0,j = len-1;
		
		while(i<j){
			if(set.contains(cArray[i]) && set.contains(cArray[j])){
				char tmp = cArray[i];
				cArray[i] = cArray[j];
				cArray[j] = tmp;
				i++;j--;
			}
			if(!set.contains(cArray[i])) i++;			
			if(!set.contains(cArray[j])) j--;						
		}		
		return new String(cArray);      
    } 
	
	public static void main(String args[]) {
		
		Solution_345 solution = new Solution_345();
		System.out.println(solution.reverseVowels("aA"));
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

