package com.jobdu;
import java.util.*;
/*
��Ŀ������
�����ֻ�����������ĸ�ķ�ʽ�����������ѵ�ʱ��
�磺a,b,c���ڡ�1�����ϣ�����aֻ��Ҫ��һ�Σ�����c��Ҫ���������Ρ�
������������ַ�����ͬһ�������ϣ����ֱ�Ӱ����磺ad��Ҫ�����£�kz��Ҫ��6��
����������ַ���ͬһ�������ϣ�����������֮����Ҫ��һ��ʱ�䣬��ac���ڰ���a֮����Ҫ��һ������ܰ�c��
���ڼ���ÿ��һ����Ҫ����һ��ʱ��Σ��ȴ�ʱ����Ҫ��������ʱ��Ρ�
���ڸ���һ���ַ�����Ҫ�����������Ҫ���ѵ�ʱ�䡣
���룺
һ�����Ȳ�����100���ַ���������ֻ���ֻ��������е�Сд��ĸ
�����
������ܰ����������ݣ�����ÿ�����ݣ��������Input�����ַ�������Ҫ��ʱ��
�������룺
bob
www
���������
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