package com.leetcode;
import java.util.*;
/*
https://leetcode.com/discuss/58631/3-4-short-lines-integer-newton-every-language
http://blog.csdn.net/lu597203933/article/details/44851777
https://leetcode.com/discuss/41367/newtons-method-with-only-one-variable
https://leetcode.com/discuss/73226/3-java-solutions-with-explanation
 * */
public class Solution_69 {
	/*Wrong
	 * public int mySqrt(int x) {
		  
		double begin = 0,end = x;
		double result = 1,mid = 1;
        while(Math.abs(result-x) > 0.1){
        	mid = (begin + end)/2;
        	result = mid * mid;
        	if(result > x)
        		end = mid;       		
        	else
        		begin = mid;        	
        	if(result == x) return (int)mid;
        	else if(result < x)
        		begin = mid;
        	else{
        		end = mid;
        	}
        }
        return (int)(mid);
    }*/
	/*accepted
	 * public int mySqrt(int x) {
		int i;
        for(i=1;i<=(x/i);++i){       	
        }       
		return i-1; 
    }*/
	public static void main(String args[]) {
		
		Solution_69 solution = new Solution_69();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 	        
			System.out.println(solution.mySqrt(n));			
		}
	
	}
	
	// good O(log2n)
	public int mySqrt(int x) {
		if(x == 0) return 0;
        int start = 1,end =x, mid = 1;
		while(start < end){
			mid = start +(end-start)/2;
			if(mid > x/mid)
				end = mid;			
			if(mid <=x/mid && (mid+1)>x/(mid+1))
				return mid;
			else if(mid < x/mid)
				start = mid;
		}
		return mid;
    }


}

