package com.jobdu;
import java.util.*;
/*
��Ŀ������
��дһ����������һ��mXn�ľ���洢��������������ÿ�е����ֵ��ÿ�е��ܺ͡�
Ҫ���ÿ���ܺͷ���ÿ�����ֵ��λ�ã�����ж�����ֵ��ȡ�±�ֵ��С����һ����Ϊ���ֵ��
��󽫽�����������
���룺
����ĵ�һ�а�����������m��n(1<=m,n<=100)���ֱ���������к��е�ά����
��������m��ÿ����n��������������Ԫ�ء�
�����
�����ж���������ݣ�����ÿ�����ݣ��������ĿҪ��ִ�к�ľ���
�������룺
3 3
1 1 1
1 1 1
1 1 1
3 3
3 2 3
2 3 2
3 2 3
���������
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