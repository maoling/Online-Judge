package com.jobdu;
import java.util.*;
/*
��Ŀ������
NֻС����(1 <= N <= 100)��ÿֻ��ͷ�ϴ���һ������ɫ��ñ�ӡ����ڳƳ�ÿֻ�����������Ҫ���հ��������Ӵ�С��˳���������ͷ��ñ�ӵ���ɫ��ñ�ӵ���ɫ�á�red������blue�����ַ�������ʾ����ͬ��С������Դ���ͬ��ɫ��ñ�ӡ������������������ʾ��
���룺
�స�����룬ÿ�������������һ��Ϊһ������N����ʾС�������Ŀ��
������N�У�ÿ����һֻ�������Ϣ����һ��Ϊ������100������������ʾ��������������ڶ���Ϊ�ַ�������ʾ�����ñ����ɫ���ַ������Ȳ�����10���ַ���
ע�⣺���������������ͬ��
�����
ÿ���������հ���������Ӵ�С��˳����������ñ����ɫ��
�������룺
3
30 red
50 blue
40 green
���������
blue
green
red
 * */

/*
5
30 red
10 origin
50 blue
40 green
39 pire*/

public class Main_1110 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		TreeMap<Integer, String> treeMap = null;
		while (cin.hasNext()) {
			
			n = cin.nextInt(); 
			treeMap = new TreeMap<Integer,String>(new Comparator<Integer>(){  
	             /*  
	             * int compare(Object o1, Object o2) ����һ���������͵����ͣ�  
	             * ���ظ�����ʾ��o1 С��o2��  
	             * ����0 ��ʾ��o1��o2��ȣ�  
	             * ����������ʾ��o1����o2��  
	             */    
	            public int compare(Integer a,Integer b){  
	                return b-a;           
	            }  
	        }); 

			for(int i=0;i<n;i++){
				String key = cin.next();
				String value = cin.next();
				treeMap.put(Integer.parseInt(key), value);
			}
			for(Map.Entry<Integer, String> entry:treeMap.entrySet()){
				System.out.println(entry.getValue());
			}
		}
	}
}