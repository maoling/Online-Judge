import java.util.*;
/*
��Ŀ������
������Ҷ�֪���������ڼ�������д洢���Զ����Ƶ���ʽ�洢�ġ�
������һ�죬С��ѧ��C����֮������֪��һ������Ϊunsigned int ���͵����֣��洢�ڼ�����еĶ����ƴ���ʲô���ӵġ�
�������ܰ��С���𣿲��ң�С������Ҫ�����ƴ���ǰ���û�������0������Ҫȥ��ǰ��0��
���룺
��һ�У�һ������T��T<=1000������ʾ����Ҫ������ֵĸ�����
��������T�У�ÿ����һ������n��0<=n<=10^8������ʾҪ��Ķ����ƴ���
�����
�����T�С�ÿ�������õĶ����ƴ���
�������룺
5
23
535
2624
56275
989835
���������
10111
1000010111
101001000000
1101101111010011
11110001101010001011
 * */
public class Main_1473 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		int res[];
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			res = new int[50];
			int len = 0;
			while(n!=0){
				res[len++] = n%2;
				n/=2;
			}
			for(int i=len;i>=0;i--){
				if(res[i]==0){
					continue;
				}else{
					System.out.print(res[i]);
				}
			}
			System.out.println();
			
		}
	}
}