package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_257 {
	public List<String> binaryTreePaths(TreeNode root){
		List<String> list = new ArrayList<String>();
		if(root == null)	return list;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<StringBuilder> strStack = new Stack<StringBuilder>();
		stack.push(root);
		StringBuilder sb = new StringBuilder();
		sb.append(root.val);
		strStack.push(sb);
		
		while(!stack.isEmpty()){
			
			int size = stack.size();		
			for(int i=0;i<size;i++){
				TreeNode  tmpNodes = stack.pop();
				StringBuilder tmpsb = strStack.pop();
							
				if(tmpNodes.right != null){
					stack.push(tmpNodes.right);	
					StringBuilder sbr = new StringBuilder();
					sbr.append(tmpsb);
					sbr.append("->"+tmpNodes.right.val);
					strStack.push(sbr);
			    }
				if(tmpNodes.left != null){
					stack.push(tmpNodes.left);	
					StringBuilder sbl = new StringBuilder();
					sbl.append(tmpsb);
					sbl.append("->"+tmpNodes.left.val);
					strStack.push(sbl);
				}
				if(tmpNodes.left == null && tmpNodes.right == null){
					list.add(tmpsb.toString());
				}		
		    }			       
		}
		 return list;
	}
	
	public static void main(String args[]) {
		
		Solution_257 solution = new Solution_257();		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

