import java.util.*;

import com.sun.javafx.scene.layout.region.Margins.Converter;
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
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String str;
		while (cin.hasNext()) {
			
			str = cin.nextLine();
			char []charArray =str.toCharArray();
			int []num = new int[1010];
			int []res = new int [4040];
			
			for(int i=0;i<charArray.length;i++){
				num[i] = charArray[i]-'0';
			}
			//http://t.jobdu.com/viewthread.php?tid=7931&rpid=171372&ordertype=0&page=2#pid171372   20#
			convert(num, res, 10, 2);
			convert(res, num, 2, 10);
			int i = charArray.length - 1;
            while (i > 0 && num[i] == 0)  //����ǰ��0 
            {
                    i--;
            }
			for(;i>=0;i--){
				System.out.print(num[i]);
			}
			System.out.println();
		}
	}
	
	static void convert(int []a,int len_a, int []b,int len_b,int m,int n ){
				
		
		int i=0;
		int len_res=0;
		while(i<len_a){		
			int r = 0;
			
			for(int j=i;j<len_a;j++){
				r = r*m+a[j];
				a[j] = r/n;
				r%=n;				
				
			}
			b[len_res++] = r;
			if(a[i] == 0){
				i++;
			}
		}
	}
}