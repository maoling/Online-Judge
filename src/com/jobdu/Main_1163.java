package com.jobdu;
import java.util.*;
/*
��Ŀ������
����һ������n(2<=n<=10000)��Ҫ��������д�1���������֮��(������1���������)��λΪ1�����������û�������-1��
���룺
�����ж������ݡ�
ÿ��һ�У�����n��
�����
������д�1���������֮��(������1���������)��λΪ1������(����֮���ÿո���������һ����������û�пո�)�����û�������-1��
�������룺
100
���������
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