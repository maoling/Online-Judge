package com.jobdu;
import java.util.*;
/*
��Ŀ������
�������ѧ�У�����ѧ������������n����ͬԪ����ȡ��m��m<=n����Ԫ�ص��������еĸ�����������n��ȡm������������Ϊp(n, m)��������㷽��Ϊp(n, m)=n(n-1)(n-2)����(n-m+1)= n!/(n-m)! (�涨0!=1).��n��m���Ǻ�Сʱ������������ǱȽϴ����ֵ������  p(10,5)=30240������ö����Ʊ�ʾΪp(10,5)=30240=( 111011000100000)b��Ҳ����˵���������5���㡣���ǵ�������ǣ�����һ�������������������Ʊ�ʾ�ĺ����ж��ٸ��������㡣
���룺
�����������������ݣ�ÿ���������һ�С�
ÿ������������n��m��0<m<=n<=10000��n=0��־����������������ݲ��ô���
�����
����ÿ�����룬���������p(n, m)�Ķ����Ʊ�ʾ�����ж��ٸ��������㡣ÿ���������һ�С�
�������룺
10 5
6 1
0 0
���������
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