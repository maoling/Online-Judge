package com.jobdu;
import java.util.*;
/*
题目描述：
在组合数学中，我们学过排列数。从n个不同元素中取出m（m<=n）个元素的所有排列的个数，叫做从n中取m的排列数，记为p(n, m)。具体计算方法为p(n, m)=n(n-1)(n-2)……(n-m+1)= n!/(n-m)! (规定0!=1).当n和m不是很小时，这个排列数是比较大的数值，比如  p(10,5)=30240。如果用二进制表示为p(10,5)=30240=( 111011000100000)b，也就是说，最后面有5个零。我们的问题就是，给定一个排列数，算出其二进制表示的后面有多少个连续的零。
输入：
输入包含多组测试数据，每组测试数据一行。
每行两个整数，n和m，0<m<=n<=10000，n=0标志输入结束，该组数据不用处理。
输出：
对于每个输入，输出排列数p(n, m)的二进制表示后面有多少个连续的零。每个输出放在一行。
样例输入：
10 5
6 1
0 0
样例输出：
5
1
 * */

public class Main_1466 {
	static int countNewZero(int n){
		int count = 0;
		while(n!=0){
			if(n%2==0){
				n>>=1;
				count++;
			}else{
				break;
			}
		}
		return count;
	}
	
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int m,n;
		while (cin.hasNext()) {
			m = cin.nextInt();n = cin.nextInt(); 
			if(n == 0){
				break;
			}
			int sum = 0;
			for(int i=m;i>m-n;i--){
				sum+=countNewZero(i);
			}
			System.out.println(sum);
		}
	}
}