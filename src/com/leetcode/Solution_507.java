package com.leetcode;

/*
1 + 2 + 4 + 7 + 14
 * */
public class Solution_507 {
	
	private int gongYueShu(int num) {
		int sum = 1;
		if (num == 1) return -1;
		for (int i=2;i<= (int)Math.sqrt(num);i++) {
			if (num % i == 0) {
				sum += i;
				if (i * i != num) {
					sum += (num / i);
				}
			}
		}
		return sum;
	}
	
	public boolean checkPerfectNumber(int num) {		 
	     return gongYueShu(num) == num;   
	}
	
	public static void main(String args[]) {
		
		Solution_507 solution = new Solution_507();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

