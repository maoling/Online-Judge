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
	static int k=0;
	static void Convert(int []a, int len,int []b, int m, int n)
	{
	        
	        int i = 0;
	        while (i < len)
	        {
	                
	                int r = 0;
	                for (int j = i; j < len; j++)
	                {
	                        r = r * m + a[j];
	                        a[j] = r / n;
	                        r %= n;
	                }
	                b[k++] = r;
	                if (a[i] == 0)
	                {
	                        i++;
	                }
	        }
	}
	
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String str;
		while (cin.hasNext()) {
			
			str = cin.nextLine();
			char []charArray =str.toCharArray();
			int []num = new int[1000];
			int []res = new int [4000];
			
			for(int i=0;i<charArray.length;i++){
				num[i] = charArray[i]-'0';
			}
			
			Convert(num,charArray.length, res,10,2);
			int temp = k;
			Convert(res,temp, num,2,10);
			int i = charArray.length - 1;
			while (i > 0 && num[i] == 0)  //处理前导0 
            {
                    i--;
            }
            for (; i >= 0; i--)
            {
                    System.out.println(num[i]);
            }
            System.out.println();
		}
	}
	
	
}