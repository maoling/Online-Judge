package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_111 {
	/**
    public int maxDepth(TreeNode root){	
		if(root == null) return 0;
		int l = maxDepth(root.left);
		int r = maxDepth(root.right);
		if(Math.abs(l - r) > 1)	result = false;
		
		return Math.max(l, r) + 1;
	}
	 */
	public int minDepth(TreeNode root){
		if(root == null)	return 0;
		if(root.right == null) return minDepth(root.left)+1;
		if(root.left == null) return minDepth(root.right)+1;
		return 1+Math.min(minDepth(root.left), minDepth(root.right));
	}
	public static void main(String args[]) {
		
		Solution_111 solution = new Solution_111();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

