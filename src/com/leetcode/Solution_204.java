package com.leetcode;
import java.util.*;
/*
 * */

public class Solution_204 {
	//16:35--16:58(23min)
    public int countPrimes(int n){
    	if(n == 1 || n == 2) return 0;
    	int[] primes = new int[n+1];
    	for(int i=2;i <= n/2;i++){
    		for(int j=2;j <= n/i;j++){
    			primes[i*j] = 1;
    		} 		
    	}
    	int count = 0;
    	for(int i=2;i < n;i++){
    		if(primes[i] == 0) count++;
    	}
    	return count;
    }	
	
	public static void main(String args[]) {	
		Solution_204 solution = new Solution_204();			
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			System.out.println(solution.countPrimes(n));		
		}
	}
}

