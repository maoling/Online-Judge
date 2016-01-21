package com.jobdu;
import java.util.*;
/*
 * 题目1134：密码翻译
时间限制：1 秒内存限制：32 兆特殊判题：否提交：1997解决：817
题目描述：
    在情报传递过程中，为了防止情报被截获，往往需要对情报用一定的方式加密，简单的加密算法虽然不足以完全避免情报被破译，但仍然能防止情报被轻易的识别。
    我们给出一种最简的的加密方法，对给定的一个字符串，把其中从a-y,A-Y的字母用其后继字母替代，把z和Z用a和A替代，则可得到一个简单的加密字符串。
输入：
        可能有多组测试数据。每组测试数据的第一行是字符串的数目n， (也要使用get(s)读取字符串,再用n=atoi(s)获得整数数值)，其余n行每行一个字符串,用gets(s)方式读取这一行字符串.每个字符串长度小于80个字符。
输出：
    对于每组数据，输出每行字符串的加密字符串。
样例输入：
2
Hello! How are you!
l love u
样例输出：
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