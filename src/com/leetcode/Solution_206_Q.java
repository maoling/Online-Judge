package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_206_Q {
	public ListNode reverseList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode pre = null,curr = null;
		ListNode tmp = head;
		while(tmp != null){
			pre = curr;
			curr = tmp;
			tmp = curr.next;
			curr.next = null;		
		}
		return curr;
		
		/*while(tmp != null){
			pre = curr;
			curr = tmp;
			tmp = curr.next;
			curr.next = pre;
		}
		return curr;
		*/
		/*
		ListNode curr = head;
		ListNode tmp = curr;
		while(tmp.next != null){
			tmp = curr.next;
			tmp = curr;
			curr = curr.next;
		}
		return curr;*/
	}
	
	public static void main(String args[]) {
		
		Solution_206_Q solution = new Solution_206_Q();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

