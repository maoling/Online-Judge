package com.jobdu;
import java.util.*;

import com.sun.org.apache.xpath.internal.functions.FuncBoolean;
/*
��Ŀ������
������Ҷ�֪���������ڼ�������д洢���Զ����Ƶ���ʽ�洢�ġ�
������һ�죬С��ѧ��C����֮������֪��һ������Ϊunsigned int ���͵����֣��洢�ڼ�����еĶ����ƴ���ʲô���ӵġ�
�������ܰ��С���𣿲��ң�С������Ҫ�����ƴ���ǰ���û�������0������Ҫȥ��ǰ��0��
���룺
��һ�У�һ������T��T<=1000������ʾ����Ҫ������ֵĸ�����
��������T�У�ÿ����һ������n��0<=n<=10^8������ʾҪ��Ķ����ƴ���
�����
�����T�С�ÿ�������õĶ����ƴ���
�������룺
5
23
535
2624
56275
989835
���������
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