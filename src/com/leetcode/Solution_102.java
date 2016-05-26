package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_102 {
	public List<List<Integer>> levelOrder(TreeNode root){

		List<List<Integer>> bigList = new ArrayList<List<Integer>>();
        if(root == null) return bigList;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		int size = 0;
		while(!queue.isEmpty()){
			size = queue.size();
			List<Integer> smalllist = new ArrayList<Integer>();		
			for(int i=0;i<size;i++){			
				TreeNode tmp = queue.poll();
				smalllist.add(tmp.val);
				if(tmp.left != null){
					queue.offer(tmp.left);
				}
				if(tmp.right != null){
					queue.offer(tmp.right);
				}
			}
			bigList.add(smalllist);
		}
		
		return bigList;
	}
	
	public static void main(String args[]) {
		
		Solution_102 solution = new Solution_102();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

