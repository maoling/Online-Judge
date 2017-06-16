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
         Queue<TreeNode> queue = new LinkedList<TreeNode>();
         Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
         Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
         queue1.offer(t1); 
         queue2.offer(t2);
         resultTreeNode = new TreeNode(t1.val + t2.val);
         queue.offer(resultTreeNode);
         TreeNode tmpNode = null;
         while (!queue1.isEmpty() || !queue2.isEmpty()) {
        	 TreeNode tmpNode1 = queue1.poll(); 
        	 TreeNode tmpNode2 = queue2.poll();
        	 tmpNode = queue.poll();
        	 if (tmpNode1.left != null || tmpNode2.left != null) {
        		 int leftVal1 = tmpNode1.left != null ? tmpNode1.left.val : 0;
        		 int leftVal2 = tmpNode2.left != null ? tmpNode2.left.val : 0;
        		 queue1.offer(tmpNode1.left);
            	 queue2.offer(tmpNode2.left); 
            	 TreeNode nodeLeft = new TreeNode(leftVal1 + leftVal2);
            	 tmpNode.left = nodeLeft;
            	 queue.offer(nodeLeft);
        	 }
        	 if (tmpNode1.right != null || tmpNode2.right != null) {
        		 int rightVal1 = tmpNode1.right != null ? tmpNode1.right.val : 0;
        		 int rightVal2 = tmpNode2.right != null ? tmpNode2.right.val : 0;
        		 queue1.offer(tmpNode1.right);
            	 queue2.offer(tmpNode2.right); 
            	 TreeNode nodeRight = new TreeNode(rightVal1 + rightVal2);
            	 tmpNode.right = nodeRight;
            	 queue.offer(nodeRight);
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

