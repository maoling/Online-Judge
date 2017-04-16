package com.leetcode;
import java.util.*;

import sun.java2d.StateTrackable;
/*
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
 * */
public class Solution_113 {
	
	private int sumIntList(List<Integer> rootList) {
		int sum = 0;
		if (rootList == null) return -1; 
		for (Integer val : rootList) {
			sum += val;
		}
		return sum;
	}
	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> biglist = new  ArrayList<List<Integer>>();
    	if(root == null ) return biglist;
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	Stack<List<Integer>> sumStack = new Stack<List<Integer>>();  	
    	stack.push(root);
    	List<Integer> rootList = new ArrayList<>();
    	rootList.add(root.val);
    	sumStack.push(rootList);
    	
    	while (!stack.isEmpty()) {
    		
    		TreeNode tmpNode = stack.pop();
    		List<Integer> tmpList = sumStack.pop();
    		if (tmpNode.left == null || tmpNode.right == null) {
    		   if (sumIntList(tmpList) == sum) {
    			   biglist.add(tmpList);
        	   }
    		}
    		
            if (tmpNode.right != null ) {
            	stack.push(tmpNode.right);
            	tmpList.add(tmpNode.right.val);
            	sumStack.push(tmpList);
            	tmpList.remove(tmpList.size()-1);
    		}
            if (tmpNode.left != null ) {
            	stack.push(tmpNode.left);
            	tmpList.add(tmpNode.left.val);
            	sumStack.push(tmpList);           	
    		}
    		  			
    	}
    	
		return biglist;
    }

	public static void main(String args[]) {
		
		Solution_113 solution = new Solution_113();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

