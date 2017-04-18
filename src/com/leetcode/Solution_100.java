package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_100 {
	public boolean isSameTree(TreeNode p,TreeNode q){
		if(p == null && q == null) return true;
		if(p == null && q != null || p != null && q == null)  return false;
		if(p.val != q.val) return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		
		/*if(p == null && q == null) return true;
		if(p == null && q != null || p != null && q == null)  return false;
		Stack<TreeNode> stackP = new Stack<TreeNode>();
		Stack<TreeNode> stackQ = new Stack<TreeNode>();
		stackP.push(p);
		stackQ.push(q);
		while(!stackP.isEmpty() && !stackQ.isEmpty()){
			TreeNode tmpP = stackP.pop();
			TreeNode tmpQ = stackQ.pop();
			if(tmpP.val != tmpQ.val)  return false;
			if(tmpP.left != null && tmpQ.left != null){
				stackP.push(tmpP.left);
				stackQ.push(tmpQ.left);
			}
		    if(tmpP.left == null && tmpQ.left == null){
		    	
		    }else{
		    	return false;
		    }
		    if(tmpP.right != null && tmpQ.right != null){
				stackP.push(tmpP.right);
				stackQ.push(tmpQ.right);
			}
		    if(tmpP.right == null && tmpQ.right == null){
		    	
		    }else{
		    	return false;
		    }		    
		}		
		
		
		if(!stackP.isEmpty() || !stackQ.isEmpty())  return false;
		return true;*/
		
	}
	
	public static void main(String args[]) {		
		Solution_100 solution = new Solution_100();		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

