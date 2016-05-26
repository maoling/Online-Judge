package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_160 {
	
   	// O(N) O(1) °Ë×ÖÐÎÍ¼--×ÐÏ¸±Ê»­
	public ListNode getIntersectionNode(ListNode headA,ListNode headB){
		if(headA == null || headB == null) return null;
		ListNode a = headA;
		ListNode b = headB;
		
		while(a != b){
			 a = (a==null?headB:a.next);
			 b = (b==null?headA:b.next);
		}
		return a;
	}
	
	public static void main(String args[]) {
		
		Solution_160 solution = new Solution_160();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

