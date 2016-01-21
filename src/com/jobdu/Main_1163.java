package com.jobdu;
import java.util.*;
/*
题目描述：
输入一个整数n(2<=n<=10000)，要求输出所有从1到这个整数之间(不包括1和这个整数)个位为1的素数，如果没有则输出-1。
输入：
输入有多组数据。
每组一行，输入n。
输出：
输出所有从1到这个整数之间(不包括1和这个整数)个位为1的素数(素数之间用空格隔开，最后一个素数后面没有空格)，如果没有则输出-1。
样例输入：
100
样例输出：
11 31 41 61 71
 * */
public class Main_1163 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		int arr[];
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			arr = new int[n];
			for(int i=2;i<=(n/2);i++){
				for(int j=2;i*j<n;j++){
					 arr[i*j] = 1;
				}			
			}
			arr[0]=1;arr[1]=1;
			int flag=1;
			for(int i=0;i<arr.length;i++){		
				
				if(arr[i]==0 && (i%10)==1){
					if(flag==1){
						System.out.print(i);
						flag = 0;
					}else{
						System.out.print(" "+i);
					}
					
				}
			}
			if(flag ==1 ){
				System.out.println("-1");
			}else{
				System.out.println();
			}
			
		}
	}
}