package com.leetcode;
/*
Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution_438 {
	
	private String sortStr(String s) {
		char[] charArr = s.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);
	}
	
    public List<Integer> findAnagrams(String s, String p) {
    	
    	String anagramP = sortStr(p);
    	List<Integer> indexList = new ArrayList<>();
    	for (int i=0;i<s.length();i++) {
    		int endIndex = i + p.length();
    		if (endIndex >= s.length()) endIndex = s.length();
    		String subStr = s.substring(i, endIndex);
    		if (sortStr(subStr).equals(anagramP)) {
    			indexList.add(i);
    		}
    	}
    	return indexList;
    }
	
	public static void main(String args[]) {
		
		Solution_438 solution = new Solution_438();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

