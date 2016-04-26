package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_14 {
	 public static void main(String args[]) {
		
		Solution_14 solution =new Solution_14();
		
        String[] string = {"abca","aba","aaab"};
        System.out.println(solution.longestCommonPrefix(string));
	}
	 
	//最长公共前缀串
	 public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0 || strs == null)  return "";
		int minlen = strs[0].length();
		for(int i=1;i<strs.length;i++){
			if(strs[i].equals("")) return "";
			if(strs[i].length() < minlen)
				minlen = strs[i].length();
		}
				
			for(int j=0;j<minlen;j++){
				for(int i=1;i<strs.length;i++){
				if(strs[0].charAt(j) != strs[i].charAt(j))
					return strs[0].substring(0,j);
		   }
		}
		
		return strs[0].substring(0,minlen);
	 }
}

