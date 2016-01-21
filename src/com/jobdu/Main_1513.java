package com.jobdu;
import java.util.*;
/*
题目描述：
输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
输入：
输入可能包含多个测试样例。
对于每个输入文件，第一行输入一个整数T，代表测试样例的数量。对于每个测试样例输入为一个整数。
。n保证是int范围内的一个整数。
输出：
对应每个测试案例，
输出一个整数，代表输入的那个数中1的个数。
样例输入：
3
4
5
-1
3
4
5
8
样例输出：
1
2
32
 * */

//优秀的博客  http://www.cnblogs.com/xing901022/category/597987.html
public class Main_1513 {
	static void fun(int n){
		int sum=0;
		for(int i=0;i<32;i++){
			sum +=(n&1);
			n =n>>1;
		}
		System.out.println(sum);
		
	}
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		int []num;
		
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			num = new int[n];
			for(int i=0;i<n;i++){
				num[i] = cin.nextInt();				
			}
			for(int i=0;i<n;i++){
				fun(num[i]);		
			}
			
		}
	}
}