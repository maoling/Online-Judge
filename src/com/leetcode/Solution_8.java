package com.leetcode;
import java.util.*;
/*
  -123456qwrewr
156 789wrwe
 100000000300
 * */
public class Solution_8 {
	public int myAtoi(String str) {
	   int result = 0, i = 0,sign=1;
       if(str == null || str.length() == 0)
    	   return result; 
       while(str.charAt(i) ==' ' && i<str.length()){
    	   i++;
       }
       if(str.charAt(i) ==' '||){
    	   
       }
    }
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String s = null;
		Solution_8 solution = null;
		while (cin.hasNext()) {
			solution = new Solution_8();
			s = cin.next();
			System.out.println(solution.myAtoi(s));;
			
		}
	}
}

