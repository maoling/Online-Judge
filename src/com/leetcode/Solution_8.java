package com.leetcode;
import java.util.*;
/*
 124568qrqwr
  -123456qwrewr
156 789wrwe
 100000000300
 -888888888888888
 -2147483648
 2147483647
 * */
public class Solution_8 {
	
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
	
	
	
	public int myAtoi(String str) {
		
	   long result = 0;
	   int i = 0,sign=1;
       if(str == null || str.length() == 0)
    	   return 0; 
       while(str.charAt(i) ==' ' && i<str.length()){
    	   i++;
       }
       if(str.charAt(i) =='+' || str.charAt(i) =='-'){
    	   sign = str.charAt(i) =='+'? 1:-1;
    	   i++;
       }
       while( i<str.length() ){   	
    	    if(str.charAt(i) <'0' || str.charAt(i) >'9')
    		   break;
    	    result = result*10 + (str.charAt(i)-'0'); 
    	    if(sign == 1 && result > Integer.MAX_VALUE )
    	    	return Integer.MAX_VALUE;   	    
    	    if(sign == -1 && sign*result < Integer.MIN_VALUE)
    	    	return Integer.MIN_VALUE;   	    
    	    i++;
       }
       
       return (int) (sign*result);
    }
}

