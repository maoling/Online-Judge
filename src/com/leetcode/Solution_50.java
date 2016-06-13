package com.leetcode;
import java.util.*;

/*

 * */
public class Solution_50 {
	public static void main(String args[]) {
		
		Solution_50 solution = new Solution_50();
		Scanner cin = new Scanner(System.in);
		int n;
		System.out.println(solution.myPow(2, 7));
		
		/*while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
	public double myPow(double x,int n){
		
		//double temp = x;
		if(n == 0) 	return 1;
		///if(n == 1)  return x;	
		if(n<0){
            n = -n;
            x = 1/x;
        }
		return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
		
		/*if(n % 2 == 0){
			return myPow(x, n/2) * myPow(x, n/2);
		}else{
			return x * myPow(x, n/2) * myPow(x, n/2);									
		}*/
		
	}
}

