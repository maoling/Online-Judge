package com.leetcode;
import java.util.*;

import sun.text.normalizer.IntTrie;
/*

 * */
public class Solution_264 {
	//18:06--19:26 (1h20min)(undo)
	public int nthUglyNumber(int n){
		if(n <= 0) return 0;
		int[] Ugly = new int[n]; //一定要需要利用到数组，记录之前的结果
		int index = 1;
		
		Ugly[0] = 1;
		int index2 = 0,f2 = 2;
    	int index3 = 0,f3 = 3;
    	int index5 = 0,f5 = 5;  	
    	
	    while(index < n){	    	
	    	int minVal  = min(f2, f3, f5);
	    	Ugly[index++] = minVal;
	    	if(minVal == f2)
	    		f2 = Ugly[++index2] * 2;    		    	
	    	if(minVal == f3)
	    		f3 = Ugly[++index3] * 3;    			    	
	    	if(minVal == f5) 
	    		f5 = Ugly[++index5] * 5;	    			    		    		    		    	
	    }
	    
	    return Ugly[n-1];
	}
	private int min(int a,int b,int c){
		//int tmp = a<b?a:b;
		return (a<b?a:b)<c?(a<b?a:b):c;
	}
	public static void main(String args[]) {
		
		Solution_264 solution = new Solution_264();
		
		
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			System.out.println(solution.nthUglyNumber(n));
		}
	}
}

