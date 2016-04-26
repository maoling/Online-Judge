package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_83 {
	public ListNode deleteDuplicates(ListNode head){
	    if(head == null || head.next == null) return head;
	    ListNode start = head;
	    while(start.next != null){
		     if(start.val == start.next.val)
		    	 start.next = start.next.next;
		     else 
		    	 start = start.next;
	    }
		return head;
	}	
	
	public static void main(String args[]) {
		
		Solution_83 solution = new Solution_83();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}
	}
}

