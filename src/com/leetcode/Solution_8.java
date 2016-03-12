package com.leetcode;
import java.util.*;
/*
 124568qrqwr
  -123456qwrewr
156 789wrwe
 100000000300
 -888888888888888
 * */
public class Solution_8 {
	
	public int myAtoi(String str) {
		
	   int result = 0, i = 0,sign=1;
       if(str == null || str.length() == 0)
    	   return result; 
       while(str.charAt(i) ==' ' && i<str.length()){
    	   i++;
       }
       if(str.charAt(i) =='+' || str.charAt(i) =='-'){
    	   sign = str.charAt(i) =='+'? 1:-1;
    	   i++;
       }
       while(str.charAt(i) >='0' && str.charAt(i) <='9' && i<str.length() ){
    	    result = result*10 + (str.charAt(i)-'0'); 
    	    if(result > Integer.MAX_VALUE ){
    	    	result = Integer.MAX_VALUE;
    	    }
    	    if(result < Integer.MIN_VALUE){
    	    	result = Integer.MIN_VALUE;
    	    }
    	    i++;
       }
       
       return sign*result;
    }
	
	
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String s = null;
		Solution_8 solution = null;
		while (cin.hasNext()) {
			solution = new Solution_8();
			s = cin.nextLine();
			System.out.println(solution.myAtoi(s));;
			
		}
	}
}

