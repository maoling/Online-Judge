package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_172 {
	//此法颇值得玩味，深思呀！
	
	public int trailingZeroes(int n){
	    if(n < 5) return 0;
	    int res = 0;
	    while(n > 0){
	    	n /= 5;
	    	res += n;
	    }
	    
	    return res;
	    
	    /* disgusting
	     * int[] diviors = {2,5};
	    int[] indexs = new int[2];
	    for(int i=0;i<diviors.length;i++){
	    	while(n % diviors[i] == 0){ 
	 	    	indexs[i]++;
	 	    	n /= diviors[i];
	 	    }
	    }
	   
		return Math.min(indexs[0], indexs[1]);*/
		
	}
	
	public static void main(String args[]) {
		
		Solution_172 solution = new Solution_172();
		System.out.println(solution.trailingZeroes(0));
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

