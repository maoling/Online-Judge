package com.leetcode;
import java.util.*;
/*
https://leetcode.com/discuss/90119/simple-java-0ms-implementation
 * */
public class Solution_226 {
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			val = val;
		}
	}
	
	public TreeNode invertTree(TreeNode root) {
		if(root == null)
			return null;
		TreeNode tmp = root.left;
		
		return root;       
    }
	
	public static void main(String args[]) {
		
		Scanner cin = new Scanner(System.in);
		int n;
		Solution_226 solution = null;
		while (cin.hasNext()) {
			solution = new Solution_226();
			n = cin.nextInt(); 
			
			
		}
	}
}

