package com.leetcode;
import java.util.*;
/*
 * http://blog.csdn.net/piaoxue820/article/details/39156649
https://leetcode.com/discuss/90119/simple-java-0ms-implementation
 * */
public class Solution_226_Q {
   //œ»–Ú±È¿˙
	public void preOrder(TreeNode node){
		if(node != null){
			System.out.print(node.val+" ");
			preOrder(node.left);
			preOrder(node.right);
		}
		
	}
	
	public TreeNode invertTree(TreeNode root) {
		if(root == null)
			return null;
		TreeNode tmp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(tmp);
		
		return root;       
    }
	
	public static void main(String args[]) {
		
		Scanner cin = new Scanner(System.in);
		
		Solution_226_Q solution = null;
		
		solution = new Solution_226_Q();
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left= new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		
		solution.invertTree(root);
		solution.preOrder(root);
	}
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}

