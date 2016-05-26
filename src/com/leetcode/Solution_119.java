package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_119 {
	//´Ë·¨ÓÃ¸²¸Ç£¬½ÚÊ¡ÁË¿Õ¼ä
	public List<Integer> getRow(int rowIndex){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for(int i=1;i<=rowIndex;i++){
			for(int j=i-1;j>0;j--){
				list.set(j, list.get(j-1)+list.get(j));
			}
			list.add(1);
		}
		
		return list;
	}
	
	public static void main(String args[]) {
		
		Solution_119 solution = new Solution_119();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

