package com.leetcode;

/*

 * */
public class Solution_566 {
	
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	if (r <= 0 || c <= 0) return nums; 
        int length =0;//��¼����  
        for(int i = 0; i < nums.length; i++) { //��ȡ�еĳ���  
            for(int j = 0; j < nums[i].length; j++) {//��ȡ�еĳ���  
                length++;//����+1  
            }  
        }  
        if (length != r*c)   return nums;//�������
        int[][] arr = new int[r][c];//����һ����ά����
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
            	int n = (i * nums[i].length) + j; 
                arr[n/c][n%c] =  nums[i][j];
            }  
        }
        return arr;
    }
	
	public static void main(String args[]) {
		
		Solution_566 solution = new Solution_566();
		
		
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

