package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_6{

	 public String convert(String s, int nRows) {
	    char[] c = s.toCharArray();
	    int len = c.length;
	    StringBuffer[] sb = new StringBuffer[nRows];
	    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

	    int i = 0;
	    while (i < len) {
	        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
	            sb[idx].append(c[i++]);
	        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
	            sb[idx].append(c[i++]);
	    }
	    for (int idx = 1; idx < sb.length; idx++)
	        sb[0].append(sb[idx]);
	    return sb[0].toString();
	    }
	
	public static void main(String args[]) {

		Solution_template solution = new Solution_template();

		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

