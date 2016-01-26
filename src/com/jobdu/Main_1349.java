package com.jobdu;
import java.util.*;
/*
10
1 2 2 3 3 3 3 4 5 5
3
3
2
5
3
1 1 1
2
1
0
 * */
public class Main_1349 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n,m;
		int[] arr=null;
		int[] arr2=null;
		Map<Integer, Integer> map =null;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			arr = new int[n];
			map = new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++){
				arr[i] = cin.nextInt();
				if(map.containsKey(arr[i])){
					int val =map.get(arr[i]).intValue();
					val++;
					map.put(arr[i], val);
				}else{
					map.put(arr[i], 1);
				}
			}
			m = cin.nextInt();
			arr2 = new int[m];
			for(int i=0;i<m;i++){
				arr2[i] = cin.nextInt();
			}
			for(int i=0;i<m;i++){
				if(map.get(arr2[i])==null){
					System.out.println("0");
				}else{
					System.out.println(map.get(arr2[i]));
				}
				
			}
		}
	}
}