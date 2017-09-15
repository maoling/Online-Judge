package com.leetcode;
import java.util.*;
/*
平衡树。左右字数深度相差不超过1
Solution_104
 * */
public class Solution_110 {
	private boolean result = true;
	public boolean isBalanced(TreeNode root){
		maxDepth(root);
		return result;
	}
	
	public int maxDepth(TreeNode root){	
		if(root == null) return 0;
		int l = maxDepth(root.left);
		int r = maxDepth(root.right);
		if(Math.abs(l - r) > 1)	result = false;
		
		return Math.max(l, r) + 1;
	}
	
	public static void main(String args[]) {
		
		Solution_110 solution = new Solution_110();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

