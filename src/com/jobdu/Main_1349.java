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

		while (cin.hasNext()) {
			n = cin.nextInt(); 
			arr = new int[2000000];
			
			for(int i=0;i<n;i++){
				arr[cin.nextInt()]++;			
			}
			m = cin.nextInt();
			
			for(int i=0;i<m;i++){
				System.out.println(arr[cin.nextInt()]);
			}

				
			}
	}
	static void fun(int arr[],int queryNum){
		int low = 0;
		int high = arr.length-1;
		int mid = low+(high-low)/2;
		while(low<high){
			if(queryNum<arr[mid]){
				high = mid-1;
			}else if(queryNum>arr[mid]){
				low = mid+1;
			}else{
				
			}
		}
		
	}
}
