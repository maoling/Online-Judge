import java.util.*;
/*
 * 题目描述：
    给定K个整数的序列{ N1, N2, ..., NK }，其任意连续子序列可表示为{ Ni, Ni+1, ..., Nj }，其中 1 <= i <= j <= K。最大连续子序列是所有连续子序列中元素和最大的一个，例如给定序列{ -2, 11, -4, 13, -5, -2 }，其最大连续子序列为{ 11, -4, 13 }，最大和为20。现在增加一个要求，即还需要输出该子序列的第一个和最后一个元素。
输入：
    测试输入包含若干测试用例，每个测试用例占2行，第1行给出正整数K( K< 10000 )，第2行给出K个整数，中间用空格分隔。当K为0时，输入结束，该用例不被处理。
输出：
    对每个测试用例，在1行里输出最大和、最大连续子序列的第一个和最后一个元素，中间用空格分隔。如果最大连续子序列不唯一，则输出序号i和j最小的那个（如输入样例的第2、3组）。若所有K个元素都是负数，则定义其最大和为0，输出整个序列的首尾元素。
样例输入：
6
-2 11 -4 13 -5 -2
10
-10 1 2 3 4 -5 -23 3 7 -21
6
5 -8 3 2 5 0
1
10
3
-1 -5 -2
3
-1 0 -2
0
样例输出：
20 11 13
10 1 4
10 3 5
10 10 10
0 -1 -2
0 0 0
 * */
public class Main__1011 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}
	}
}