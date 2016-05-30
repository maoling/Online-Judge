package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_125 {
	public boolean isPalindrome(String s){
		if(s == null || s.length() == 0) return true;
		int len = s.length();
		int head =0,tail = len-1;
		while(head < tail){
			Character chead = s.charAt(head);
			Character ctail = s.charAt(tail);
			
			if(Character.isLetterOrDigit(chead) && Character.isLetterOrDigit(ctail)){
				if(Character.toLowerCase(chead) != Character.toLowerCase(ctail)) return false;
				head++;
                tail--;
			}	
			if(!Character.isLetterOrDigit(chead)) head++;
			if(!Character.isLetterOrDigit(ctail)) tail--;
							
		}
		
		return true;
		
		/*
		 * if (s.isEmpty()) {
            return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if(!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
		 * 
		 * */
	}
	
	public static void main(String args[]) {
		
		Solution_125 solution = new Solution_125();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

