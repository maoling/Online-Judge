package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_412 {
	
    public List<String> fizzBuzz(int n) {
    	
    	List<String> res = new ArrayList<>();   	
    	for(int i = 0;i<n;i++){
    		if (i % 3 == 0 && i % 5 != 0) {
    			res.add("Fizz");
    		}
			if (i % 5 == 0 && i % 3 != 0) {
			    res.add("Buzz");			
			}
			if (i % 3 == 0 && i % 5 == 0) {
				res.add("FizzBuzz");
			}
            if (i % 3 != 0 && i % 5 != 0) {
				res.add(i+"");
			}
    	}
    	return res;
    }
	public static void main(String args[]) {	
		Solution_412 solution = new Solution_412();		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

