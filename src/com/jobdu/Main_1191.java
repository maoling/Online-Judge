package com.jobdu;
import java.util.*;
/*
题目描述：
编写一个程序输入一个mXn的矩阵存储并输出，并且求出每行的最大值和每行的总和。
要求把每行总和放入每行最大值的位置，如果有多个最大值，取下标值最小的那一个作为最大值。
最后将结果矩阵输出。
输入：
输入的第一行包括两个整数m和n(1<=m,n<=100)，分别代表矩阵的行和列的维数。
接下来的m行每行有n个数，代表矩阵的元素。
输出：
可能有多组测试数据，对于每组数据，输出按题目要求执行后的矩阵。
样例输入：
3 3
1 1 1
1 1 1
1 1 1
3 3
3 2 3
2 3 2
3 2 3
样例输出：
3 1 1
3 1 1
3 1 1
8 2 3
2 7 2
8 2 3
 * */
public class Main_1191 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int m,n;
		int arr[][];
		while (cin.hasNext()) {
			m = cin.nextInt(); n = cin.nextInt();
			arr = new int [m][n];
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
				   arr[i][j] = cin.nextInt();
				}	
			}
			
			for(int i=0;i<m;i++){
				int index = 0;
				int max = arr[i][index];
				int sum =0;
				for(int j=0;j<n;j++){
					sum+=arr[i][j];
					if(arr[i][j]>max){
						max = arr[i][j];
						index = j;
					}
				}
				arr[i][index] = sum;
			}
			
			for(int i=0;i<m;i++){
				int flag=0;
				for(int j=0;j<n;j++){
					if(flag==0){
						System.out.print(arr[i][j]);
						flag=1;
					}else{
						System.out.print(" "+arr[i][j]);
					}
				   
				}	
				System.out.println();
			}
			
			
		}
	}
}