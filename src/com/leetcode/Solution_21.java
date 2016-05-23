package com.leetcode;
import java.util.*;
/*
https://leetcode.com/discuss/53608/simple-recursive-java-solution
 * */
public class Solution_21 {
	
	public class Solution {
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    	if(l1 == null && l2 == null)	 return null;
	    	if(l1 == null)	return l2;
	    	if(l2 == null)  return l1;
	    	
	    	ListNode head = new ListNode(0);
	    	ListNode pre = head;
	    	
	    	while(l1 != null && l2 != null){
	    		if(l1.val < l2.val){
	    			pre.next = l1;
	    			l1 = l1.next;
	    		}else{
	    			pre.next = l2;
	    			l2 = l2.next;
	    		}
	    		pre = pre.next;	    		
	    	} 
	    	if(l1 != null)
	    		pre.next = l1;
	    	if(l2 != null)
	    		pre.next = l2;
	    		
			return head.next;
	    }
	}
	
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		Solution_21 solution = null;
		while (cin.hasNext()) {
			solution = new Solution_21();
			n = cin.nextInt(); 			
		}
	}
}

