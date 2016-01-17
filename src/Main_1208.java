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