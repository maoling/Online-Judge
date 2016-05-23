package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_263 {
	//o(n) 17:24-17:37 (13min)
	
	public boolean isUgly(int num){
		
		if(num <= 0) return false;
		int[] divisors = {2,3,5};
		for(int i: divisors){
			while(num % i == 0) 
				num /= i;			
		}			
		return num == 1;
		
		/*while(num % 2 == 0) num /= 2;
		while(num % 3 == 0) num /= 3;
		while(num % 5 == 0) num /=5;
		
		return num == 1;*/
		/*if(num <= 0) return false;
		if(num == 1) return true;*/
		/*while((num&1) == 0) num >>= 1;
		while(num % 3 == 0) num /= 3;
		while(num % 5 == 0) num /=5;*/
		
		
	}
	public static void main(String args[]) {
		
		Solution_263 solution = new Solution_263();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

