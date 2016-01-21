package com.jobdu;
import java.util.*;

import com.sun.org.apache.xpath.internal.functions.FuncBoolean;
/*
题目描述：
　　大家都知道，数据在计算机里中存储是以二进制的形式存储的。
　　有一天，小明学了C语言之后，他想知道一个类型为unsigned int 类型的数字，存储在计算机中的二进制串是什么样子的。
　　你能帮帮小明吗？并且，小明不想要二进制串中前面的没有意义的0串，即要去掉前导0。
输入：
第一行，一个数字T（T<=1000），表示下面要求的数字的个数。
接下来有T行，每行有一个数字n（0<=n<=10^8），表示要求的二进制串。
输出：
输出共T行。每行输出求得的二进制串。
样例输入：
5
23
535
2624
56275
989835
样例输出：
10111
1000010111
101001000000
1101101111010011
11110001101010001011
 * */
public class Main_1473 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			int []num = new int[n];
			for(int i=0;i<n;i++){
				num[i] = cin.nextInt();
			}
			for(int i=0;i<n;i++){
				fun(num[i]);
			}
			
			
			
		}
	}
	
	static void fun(int n){
		int res[] = new int[50];
		int len = 0;
		if(n==0){
		  System.out.println(n);
		  return ;
		}
		while(n!=0){
			res[len++] = n%2;
			n/=2;
		}
		int i = len-1;
		while(res[i]==0){
			i--;
		}
		for(;i>=0;i--){	
			System.out.print(res[i]);
		}
		System.out.println();
	}
}