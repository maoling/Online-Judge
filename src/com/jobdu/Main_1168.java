package com.jobdu;
import java.util.*;
/*
��Ŀ������
����һ�����ַ����������ո񣩣��ٸ��������ַ���������Щ�ַ�����ɾ�������еĶ��ַ�����
���룺
����ֻ��1�����ݡ�
����һ�����ַ����������ո񣩣������������ַ���ֱ���ļ�����Ϊֹ��
�����
ɾ������Ķ��ַ���(�����ִ�Сд)��ȥ���ո�,�����
�������룺
in
#include 
int main()
{

printf(" Hi ");
}
���������
#clude
tma()
{

prtf("Hi");
}
��ʾ��
ע:���ַ����е�In��IN��iN��inɾ����
 * */
public class Main_1168 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String str1 = cin.nextLine();
		int n;
		while (cin.hasNext()) {
			String str2 = cin.nextLine();
			System.out.println( str2.replaceAll("(?i)"+str1,"").replaceAll(" ","") );
			
		}
	}
}