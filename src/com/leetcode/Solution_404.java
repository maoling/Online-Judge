package com.leetcode;
import java.util.Stack;

/*

 * */
public class Solution_404 {
	
    public int sumOfLeftLeaves(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        int sum = 0;
        while (!stack.isEmpty()) {
        	TreeNode tmpNode = stack.pop();
        	if (tmpNode == null) continue;
        	if (tmpNode.right != null) {
        		stack.push(tmpNode.right);
        	}
        	if (tmpNode.left != null) {
        		stack.push(tmpNode.left);
        		if (tmpNode.left.left == null && tmpNode.left.right == null) {
        		   sum += (tmpNode.left.val);
        		}
        	}
        }
        return sum;
    }
	
	public static void main(String args[]) {
		
		Solution_404 solution = new Solution_404();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

