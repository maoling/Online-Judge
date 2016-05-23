package com.leetcode;
import java.util.*;
/*

 * */

public class Solution_112 {
	//17:05
	public boolean hasPathSum(TreeNode root,int sum){	
		if(root == null) return false;
		
		Stack<TreeNode> path = new Stack<TreeNode>();
		Stack<Integer> sub = new Stack<Integer>();
		
		path.push(root);
		sub.push(root.val);
		
		while(!path.isEmpty()){
			
			TreeNode tmp = path.pop();
			Integer tmpVal = sub.pop();
			
			if(tmp.left == null && tmp.right == null){
			   if(tmpVal == sum)	return true;
			}else{
				if(tmp.left != null){
					path.push(tmp.left);
					sub.push(tmpVal+tmp.left.val);					
				}
				if(tmp.right != null){
					path.push(tmp.right);
					sub.push(tmpVal+tmp.right.val);					
				}		
			}				
		}	
		return false;
	}
	
	
	public static void main(String args[]) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		for(int i=0;i<12;i++){
			hashMap.put(i, "a");
		}
		hashMap.put(12, "a");
		hashMap.put(13, "a");
		hashMap.put(14, "a");
		hashMap.put(15, "a");
		hashMap.put(16, "a");
		
		Solution_112 solution = new Solution_112();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

