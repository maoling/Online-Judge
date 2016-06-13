package com.leetcode;
import java.util.*;
/*
You are given two linked lists representing two non-negative numbers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/
//36min
public class Solution_2 {
	
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	ListNode dummy = head;
    	
    	if(l1 == null || l2 == null)   return null;   	   	
        
    	int carry = 0;
    	while(l1 != null || l2 != null){
    		
    		if(l1 == null )  l1 = new ListNode(0);
    		if(l2 == null )  l2 = new ListNode(0);
    		
    		ListNode newNode = new ListNode((l1.val + l2.val + carry)%10);
    		carry = (l1.val + l2.val + carry)/10;
    		head.next = newNode;
    		head = newNode;
    		
    		l1 = l1.next;l2 = l2.next;
    	}
    	if(carry != 0){
    		ListNode newNode = new ListNode(carry);
    		head.next = newNode;
    	}
    	
		return dummy.next;   
    }
	
	public static void main(String args[]) {
		
		Solution_2 solution = new Solution_2();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

