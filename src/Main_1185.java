import java.util.*;
/*
题目描述：
输入一系列整数，将其中最大的数挑出，并将剩下的数进行排序。
输入：
输入第一行包括1个整数N，1<=N<=1000，代表输入数据的个数。
接下来的一行有N个整数。
输出：
可能有多组测试数据，对于每组数据，
第一行输出一个整数，代表N个整数中的最大值，并将此值从数组中去除，将剩下的数进行排序。
第二行将排序的结果输出。
样例输入：
4
1 3 4 2
5
2 3 4 5 5
3
1 1 1
样例输出：
4
1 2 3
1
5
提示：
如果数组中只有一个数，当第一行将其输出后，第二行请输出"-1"。
 * */
public class Main_1185 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		
		while (cin.hasNext()) {
			ArrayList<Integer> intArray = new ArrayList<Integer>();
			n = cin.nextInt();
	        int maxIndex = 0;
	        int max = cin.nextInt();
	        if(n == 1){
				System.out.println(max);
				System.out.println("-1");
				continue;
			}
	        intArray.add(max);	
	        
			for(int i=1;i<n;i++){
				int temp = cin.nextInt();
				intArray.add(temp);				
				if(temp>max){
					max = temp;
					maxIndex = i;
				}
			}
			intArray.remove(maxIndex);
			Collections.sort(intArray, new Comparator<Integer>() {
	            public int compare(Integer arg0, Integer arg1) {
	                return arg0-arg1;
	            }
		    });
			System.out.println(max);
			int flag =0;
			for(int i=0;i<intArray.size();i++){
				if(flag == 0){
				  System.out.print(intArray.get(i));
				  flag =1;
				}else{
				  System.out.print(" "+intArray.get(i));
				}
				
			}
			System.out.println();
		}
	}
}