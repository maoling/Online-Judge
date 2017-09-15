package com.leetcode;
import java.util.*;
/*
用一个queue来实现Stack的数据结构
 * */
public class MyStack_225 {
	private Queue<Integer> queue = new LinkedList<Integer>();
	public void push(int x){
		queue.add(x);
		int n = queue.size();
		while(n-- > 1)
			queue.add(queue.poll());				
	}
	public void pop(){
		queue.poll();
	}
	public int top(){
		return queue.peek();
	}
	
	public boolean empty(){
		return queue.isEmpty();
	}
	
	public static void main(String args[]) {
		
		MyStack_225 solution = new MyStack_225();		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

