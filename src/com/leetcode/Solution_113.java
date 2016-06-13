package com.leetcode;
import java.util.*;
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
	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> biglist = new  ArrayList<List<Integer>>();
    	if(root == null ) return biglist;
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	Stack<Integer> sumStack = new Stack<Integer>();
    	
    	stack.push(root);
    	sumStack.push(root.val);
    	
    	while(!stack.isEmpty()){
    		
    		TreeNode tmpNode = stack.pop();
    		Integer tmpVal = sumStack.pop();
    		if(tmpVal == sum){
    			
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

