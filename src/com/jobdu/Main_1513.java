package com.jobdu;
import java.util.*;
/*
��Ŀ������
����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
���룺
������ܰ����������������
����ÿ�������ļ�����һ������һ������T�������������������������ÿ��������������Ϊһ��������
��n��֤��int��Χ�ڵ�һ��������
�����
��Ӧÿ�����԰�����
���һ������������������Ǹ�����1�ĸ�����
�������룺
3
4
5
-1
3
4
5
8
���������
1
2
32
 * */

//����Ĳ���  http://www.cnblogs.com/xing901022/category/597987.html
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