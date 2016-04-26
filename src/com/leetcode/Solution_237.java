package com.leetcode;
import java.util.*;

public class Solution_237 {
	public void deleteNode(ListNode node){
		  node.val = node.next.val;
		  node.next = node.next.next;		
	}
	public static void main(String args[]) {
		
		Solution_237 solution = new Solution_237();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}
	}
}

