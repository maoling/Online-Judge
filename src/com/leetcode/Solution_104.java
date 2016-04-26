package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_104 {
	
	public int maxDepth(TreeNode root){			
		//return root==null ? 0 : 1+Math.max(maxDepth(root.left), maxDepth(root.right)) ;	
	    //DFS   (好难理解呀，花了不少时间理解)
		/*if(root == null) return 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<Integer> value = new Stack<Integer>();
		stack.push(root);
		value.push(1);
		int max = 0;
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			int temp = value.pop();
			max = Math.max(max,temp);		
			if(node.right != null){
				stack.push(node.right);
				value.push(temp+1);
			}	
			if(node.left != null){
				stack.push(node.left);
				value.push(temp+1);
			}				
		}
		return max;	*/	
		
		//BFS  (层次遍历)
		if(root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int count = 0;
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size-- > 0){
				TreeNode node = queue.poll();
				if(node.left != null){
					queue.offer(node.left);
				}
				if(node.right != null){
					queue.offer(node.right);
				}
			}
			count ++ ;
		}
						
		return count;					
	}
	
	
	public static void main(String args[]) {
		
		Integer i01 = 59;
		int i02 = 59;
		Integer i03 =Integer.valueOf(59);
		Integer i04 = new Integer(59);
		System.out.println(i02 == i04);
		//Solution_104 solution = new Solution_104();
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

