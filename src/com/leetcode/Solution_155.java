package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_155 {
	
	public static void main(String args[]) {
		
		Solution_155 solution = new Solution_155();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}
	}
}

class MinStack{
	
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minstack = new Stack<Integer>();
	
	public void push(int x){
		
		if(minstack.isEmpty() ||  x <= minstack.peek()){
			
			minstack.push(x);
		}
		stack.push(x);
	}
	
	public void pop(){
		
		if(stack.peek().equals(minstack.peek())  ){
			minstack.pop();
		}
		stack.pop();
	}
	public int top(){
		return stack.peek();	
	}
	
	public int getMin(){			
		 return minstack.peek();		
	}	
}
