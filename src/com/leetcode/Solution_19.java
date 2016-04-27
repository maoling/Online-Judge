package com.leetcode;
import java.util.*;


public class Solution_19 {
	
	public ListNode removeNthFromEnd(ListNode head , int n){
		
		ListNode start = new ListNode(0);
		ListNode slow = start,fast = start;
		start.next = head;
		
		for(int i = 0;i<n;i++){
			fast = fast.next;
		}
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		
		return start.next;	
	}
	
	public static void main(String args[]) {
		
		Solution_19 solution = new Solution_19();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}
	}
	
	
}

