import java.util.*;
/*
��Ŀ������
    ����һ��ʮ������A����Aת��Ϊ����������Ȼ��λ�������У���ת��Ϊʮ������B�����ǳ�BΪA�Ķ�������������
    �������ʮ������173�����Ķ�������ʽΪ10101101���������еõ�10110101����ʮ������Ϊ181��181��Ϊ173�Ķ�������������
���룺
    һ��1000λ(��10^999)���ڵ�ʮ��������
�����
    �����ʮ�������Ķ�������������
�������룺
173
���������
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
			while (i > 0 && num[i] == 0)  //����ǰ��0 
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