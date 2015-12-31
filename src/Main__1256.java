import java.util.*;
/*
 * 题目描述：
一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
输入：
输入的第一行包括一个整数N(1<=N<=1000)。
接下来的一行包括N个整数。
输出：
可能有多组测试数据，对于每组数据，
找出这个数组中的两个只出现了一次的数字。
输出的数字的顺序为从小到大。
样例输入：
6
2 3 9 3 7 2 
样例输出：
7 9
 * */
public class Main__1256 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int a, b;
		while (cin.hasNext()) {
			a = cin.nextInt(); 
			b = cin.nextInt();
			System.out.println(a + b);
		}
	}
}