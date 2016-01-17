import java.util.*;
/*
题目描述：
    对于一个十进制数A，将A转换为二进制数，然后按位逆序排列，再转换为十进制数B，我们乘B为A的二进制逆序数。
    例如对于十进制数173，它的二进制形式为10101101，逆序排列得到10110101，其十进制数为181，181即为173的二进制逆序数。
输入：
    一个1000位(即10^999)以内的十进制数。
输出：
    输入的十进制数的二进制逆序数。
样例输入：
173
样例输出：
181
 * */
public class Main_1208 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String str;
		while (cin.hasNext()) {
			int []res = new int [4000];
			str = cin.nextLine();
			char []charArray =str.toCharArray();
			int []num = new int[charArray.length];
			
			for(int i=0;i<charArray.length;i++){
				num[i] = charArray[i]-'0';
			}
			
			int len = charArray.length;
			int i=0,len_res=0;
			while(i<len){
				res[len_res++] = (num[len-1])%2;
				int carry = 0;
				
				for(int j=i;j<len;j++){
					int temp = num[j];
					num[j] = (num[j]+carry)/2;
					carry=((temp&1)==1)?10:0;
					if(num[i] == 0){
						i++;
					}
				}
			}
			int sum = 0;
			for(int j=0;j<len_res;j++){
				sum = sum+res[j]*(int)Math.pow(2, len_res-1-j);
				
			}
			System.out.println(sum);
		}
	}
}