package com.leetcode;
import java.util.*;
/*
Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:
Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
 * */
public class Solution_617 {
	
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    	 TreeNode resultTreeNode = null;
         if (t1 == null && t2 == null) return resultTreeNode;
         Queue<Integer> queue1 = new LinkedList<Integer>();
         Queue<Integer> queue2 = new LinkedList<Integer>();
         queue1.offer(t1.val); 
         queue2.offer(t2.val);
         resultTreeNode = new TreeNode(t1.val + t2.val);
         while (!queue1.isEmpty() || !queue2.isEmpty()) {
        	 queue1.poll(); 
        	 queue2.poll();
        	 if (t1.left != null || t2.left != null) {
        		 int leftVal1 = t1.left != null ? t1.left.val : 0;
        		 int leftVal2 = t2.left != null ? t2.left.val : 0;
        		 queue1.offer(leftVal1);
            	 queue2.offer(leftVal2); 
            	 resultTreeNode.left = new TreeNode(leftVal1 + leftVal2);
        	 }
        	 if (t1.right != null || t2.right != null) {
        		 int rightVal1 = t1.right != null ? t1.right.val : 0;
        		 int rightVal2 = t2.right != null ? t2.right.val : 0;
        		 queue1.offer(rightVal1);
            	 queue2.offer(rightVal2); 
            	 resultTreeNode.right = new TreeNode(rightVal1 + rightVal2);
        	 }
        	 
         } 
         
         return resultTreeNode;
    }
	
	public static void main(String args[]) {
		
		Solution_617 solution = new Solution_617();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

