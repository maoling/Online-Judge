package com.jobdu;
import java.util.*;
/*
题目描述：
N只小白鼠(1 <= N <= 100)，每只鼠头上戴着一顶有颜色的帽子。现在称出每只白鼠的重量，要求按照白鼠重量从大到小的顺序输出它们头上帽子的颜色。帽子的颜色用“red”，“blue”等字符串来表示。不同的小白鼠可以戴相同颜色的帽子。白鼠的重量用整数表示。
输入：
多案例输入，每个案例的输入第一行为一个整数N，表示小白鼠的数目。
下面有N行，每行是一只白鼠的信息。第一个为不大于100的正整数，表示白鼠的重量，；第二个为字符串，表示白鼠的帽子颜色，字符串长度不超过10个字符。
注意：白鼠的重量各不相同。
输出：
每个案例按照白鼠的重量从大到小的顺序输出白鼠的帽子颜色。
样例输入：
3
30 red
50 blue
40 green
样例输出：
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
	             * int compare(Object o1, Object o2) 返回一个基本类型的整型，  
	             * 返回负数表示：o1 小于o2，  
	             * 返回0 表示：o1和o2相等，  
	             * 返回正数表示：o1大于o2。  
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