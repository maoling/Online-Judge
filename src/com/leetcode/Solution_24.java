package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_24 {
	
	public ListNode swapPairs(ListNode head){		
		if(head == null || head.next == null) return head;
		
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr = dummy;
		while(curr.next !=null && curr.next.next != null){
			ListNode first = curr.next;
			ListNode second = curr.next.next;	
			first.next = second.next;
			curr.next = second;
			//curr.next.next = first;
			second.next = first;
			curr = curr.next.next;
		}
		
		return dummy.next;	
	}
	
	public static void main(String args[]) {
		
		Solution_24 solution = new Solution_24();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

