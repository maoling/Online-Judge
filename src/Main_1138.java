import java.util.*;


/*
��Ŀ������
��һ���������Ϊ30λ���ֵ�ʮ���ƷǸ�����ת��Ϊ�������������
���룺
�������ݣ�ÿ��Ϊһ�����Ȳ�����30λ��ʮ���ƷǸ�������
��ע����10�������ֵĸ���������30��������30bits��������
�����
ÿ�������Ӧ�Ķ���������
�������룺
0
1
3
8
���������
0
1
11
1000
 * */
public class Main_1138 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String str;
		while (cin.hasNext()) {
			int []res = new int [200];
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
			for(int j=len_res-1;j>=0;j--){
				System.out.print(res[j]);
			}
			System.out.println();
		}
	}
}