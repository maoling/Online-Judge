package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_504 {
	
    public String convertToBase7(int num) {
    	//Stack<String> stack = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        String sign = "";
        if (num < 0) {
        	num = - num;
        	sign = "-";
        } else if (num == 0) {
        	return "0";
        }
    	while (num != 0) {
    		sb.append(num % 7 + "");
        	num /= 7;
        }
    	return sign + sb.reverse().toString();
    }
    
	public static void main(String args[]) {
		
		Solution_504 solution = new Solution_504();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

