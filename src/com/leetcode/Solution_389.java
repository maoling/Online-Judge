package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_389 {
	
    public char findTheDifference(String s, String t) {
    	int i =0,j= t.length()-1,k= s.length()-1;
    	
    	while (i <= j) {
    		if (t.charAt(i) != s.charAt(i) ){
    			return t.charAt(i);
    		}else if (t.charAt(j) != s.charAt(k)){
    			return t.charAt(j);
    		}else if (t.charAt(i) == s.charAt(i)) {
    			i++;
    		}else if (t.charAt(j) == s.charAt(k)) {
    			j--;
    			k--;
    		}  			
    	} 
    	return (Character) null;
    }
    
	public static void main(String args[]) {
		
		Solution_389 solution = new Solution_389();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

