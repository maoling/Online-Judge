package com.jobdu;
import java.util.*;
/*
 * ��Ŀ1134�����뷭��
ʱ�����ƣ�1 ���ڴ����ƣ�32 ���������⣺���ύ��1997�����817
��Ŀ������
    ���鱨���ݹ����У�Ϊ�˷�ֹ�鱨���ػ�������Ҫ���鱨��һ���ķ�ʽ���ܣ��򵥵ļ����㷨��Ȼ��������ȫ�����鱨�����룬����Ȼ�ܷ�ֹ�鱨�����׵�ʶ��
    ���Ǹ���һ�����ĵļ��ܷ������Ը�����һ���ַ����������д�a-y,A-Y����ĸ��������ĸ�������z��Z��a��A�������ɵõ�һ���򵥵ļ����ַ�����
���룺
        �����ж���������ݡ�ÿ��������ݵĵ�һ�����ַ�������Ŀn�� (ҲҪʹ��get(s)��ȡ�ַ���,����n=atoi(s)���������ֵ)������n��ÿ��һ���ַ���,��gets(s)��ʽ��ȡ��һ���ַ���.ÿ���ַ�������С��80���ַ���
�����
    ����ÿ�����ݣ����ÿ���ַ����ļ����ַ�����
�������룺
2
Hello! How are you!
l love u
���������
Ifmmp! Ipx bsf zpv!
 
 * */
public class Main__1134 {
	
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		
		String arr[];
		while (cin.hasNext()) {
			int n = cin.nextInt(); 
			String str = cin.nextLine();
			
			while(n>0){
				 str = cin.nextLine();
				char charArray[] = str.toCharArray();
				
				for(int j=0;j<charArray.length;j++){			
					if( charArray[j] >='a'&&charArray[j] <='z'  || charArray[j] >='A'&&charArray[j] <='Z' )
					{
						if(charArray[j] =='z') charArray[j] = 'a';
						if(charArray[j] =='Z') charArray[j] = 'A';
						else {
							charArray[j] = (char)(charArray[j] +1);
						}					
					}	
				}
				for(int j=0;j<charArray.length;j++){
					System.out.print(charArray[j]);
				}
				System.out.println();
			    n--;
			}
			
		}
	}
}