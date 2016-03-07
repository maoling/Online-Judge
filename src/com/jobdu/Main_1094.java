package com.jobdu;

import java.util.Scanner;

/*
 题目描述：
 Finding all occurrences of a pattern in a text is a problem that arises frequently in text-editing programs. 
 Typically,the text is a document being edited,and the pattern searched for is a particular word supplied by the user.  
 We assume that the text is an array T[1..n] of length n and that the pattern is an array P[1..m] of length m<=n.We further assume that the elements of P and  T are all alphabets(∑={a,b...,z}).The character arrays P and T are often called strings of characters.  
 We say that pattern P occurs with shift s in the text T if 0<=s<=n and T[s+1..s+m] = P[1..m](that is if T[s+j]=P[j],for 1<=j<=m).  
 If P occurs with shift s in T,then we call s a valid shift;otherwise,we calls a invalid shift. 
 Your task is to calculate the number of vald shifts for the given text T and p attern P.
 输入：
 For each case, there are two strings T and P on a line,separated by a single space.You may assume both the length of T and P will not exceed 10^6. 
 输出：
 You should output a number on a separate line,which indicates the number of valid shifts for the given text T and pattern P.
 样例输入：
 abababab abab
 amoaolaoiaong ao
 afaf af 
 abab ab
 acdc cd
 样例输出：
 3
 * */

public class Main_1094 {

	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String s, s2;
		int m, n;

		while (cin.hasNext()) {
			s = cin.next();
			s2 = cin.next();
			System.out.println(check(s, s2));
		}
	}

	public static int check(String s, String s2) {

		int m = s.length();
		int n = s2.length();
		int count = 0;
		int k = 0;
		boolean flag;
		for (int i = 0; i < m; i++) {// abab
			k = i;
			flag = true;
			if(k <= m-n){
				for (int j = 0;j<n;j++) {// ab					
					if (s.charAt(k) == s2.charAt(j)) {
	                    k++;
					}else{
						flag = false;
						break;
					}		
				}
				if(flag){
	            	count++;
	            }
			}else{
				
				break;
			}
            
		}
		return count;
	}
}