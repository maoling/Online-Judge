package com.leetcode;
import java.util.*;


public class Solution_43 {
	public static String multiply(String a,String b){
		int[] arr = new int[a.length() + b.length()];
		
		for(int i=a.length()-1;i>=0;i--){
			int carry =0 ;
			for(int j=b.length()-1;j>=0;j--){
				arr[i+j+1] = (arr[i+j+1] + carry + (a.charAt(i)-'0') * (b.charAt(j)-'0'));
				carry = arr[i+j+1] / 10;
				arr[i+j+1] %= 10;
			}
			arr[i] = carry;
		}
		StringBuilder sb = new StringBuilder();
		int  i = 0;
		while(i < arr.length && arr[i]==0) i++;
		if(i >= arr.length) return "0";
		for(int j=i;j<arr.length;j++) sb.append(arr[j]);
		
		return sb.toString();		
	}
	public static void main(String args[]) {
		System.out.println(multiply("12", "34"));
		
		/*Solution_43 solution = new Solution_43();
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 					
		}*/
	}
}

