package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_234 {
	//o(n) o(1)--solution
	public boolean isPalindrome(ListNode head){
		if(head == null || head == head.next) return true; 
		if(head == head.next) return true; 
		
		ListNode  slow = head;
		ListNode  fast = head;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}	
		if(fast != null) slow = slow.next;
		slow = converse(slow);
		
		while(head != null && slow != null){
			if(head.val != slow.val) return false;
			head = head.next;
			slow = slow.next;
		}
		
		return true;
	}
	
	private ListNode converse(ListNode head){
		if(head == null || head.next == null) return head;
		
		ListNode pre = null,curr = null;
		ListNode tmp = head;
		while(tmp != null){
			pre = curr;
			curr = tmp;
			tmp = curr.next;
			curr.next = pre;		
		}
		return curr;
	}
	
	public static void main(String args[]) {
		
		Solution_234 solution = new Solution_234();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

