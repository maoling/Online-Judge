package com.jobdu;
import java.util.*;
/*
题目描述：
按照手机键盘输入字母的方式，计算所花费的时间
如：a,b,c都在“1”键上，输入a只需要按一次，输入c需要连续按三次。
如果连续两个字符不在同一个按键上，则可直接按，如：ad需要按两下，kz需要按6下
如果连续两字符在同一个按键上，则两个按键之间需要等一段时间，如ac，在按了a之后，需要等一会儿才能按c。
现在假设每按一次需要花费一个时间段，等待时间需要花费两个时间段。
现在给出一串字符，需要计算出它所需要花费的时间。
输入：
一个长度不大于100的字符串，其中只有手机按键上有的小写字母
输出：
输入可能包括多组数据，对于每组数据，输出按出Input所给字符串所需要的时间
样例输入：
bob
www
样例输出：
7
7 
 **/
public class Main__1079 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String str;
		int c[]={1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
		while (cin.hasNext()) {
			str = cin.nextLine(); 
			int count =0;
			char []charArray = str.toCharArray();
			for(int i=0;i<charArray.length;i++){
				count+=c[(int)charArray[i]-97];
				if(i == charArray.length-1){
					break;
				}
				if( (charArray[i+1]-charArray[i]) ==(c[(int)charArray[i+1]-97]-c[(int)charArray[i]-97]) ){
					count +=2;		
				}
			}
			System.out.println(count);	
		}
	}
}