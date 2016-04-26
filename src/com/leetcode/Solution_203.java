package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_203 {
	
	public ListNode removeElements(ListNode head, int val){
		
		ListNode start = new ListNode(0);
		start.next = head;
		while(start != null){
			start = start.next;
			if(start.next.val == val){
				  if(start.next.next == null)
					  break;				
			  start.next = start.next.next;
			}
		}	
		return head;		
	}
	public static void main(String args[]) {
		
		Solution_203 solution = new Solution_203();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 		
			
		}
	}
}

