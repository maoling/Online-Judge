package com.leetcode;
import java.util.*;

import com.sun.org.apache.regexp.internal.recompile;
/*

 * */
public class Solution_58 {
	public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0  )  return 0;
        String[] strs = s.split(" ");
        if(strs.length > 0) return strs[strs.length-1].length();
        return 0;
    }
	public static void main(String args[]) {
		
		Solution_58 solution = new Solution_58();
		String s = null;
        System.out.println(solution.lengthOfLastWord("Hello Worldsfae abc"));
	}
}

