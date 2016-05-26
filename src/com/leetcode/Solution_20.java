package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_20 {
	public boolean isValid(String s){
	   if(s == null || s.length()%2 ==1) return false;
	   
       Stack<Character> stack = new Stack<Character>();
       for(Character c:s.toCharArray()){
    	   if(c == '[') stack.push(']');
    	   if(c == '(') stack.push(')');
    	   if(c == '{') stack.push('}');
    	   else if(stack.isEmpty() || stack.pop() != c) return false;
       }
       return stack.isEmpty();
		

	}
	public static void main(String args[]) {
		
		Solution_20 solution = new Solution_20();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

