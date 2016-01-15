import java.util.*;
/*
��Ŀ������
����һϵ������������������������������ʣ�µ�����������
���룺
�����һ�а���1������N��1<=N<=1000�������������ݵĸ�����
��������һ����N��������
�����
�����ж���������ݣ�����ÿ�����ݣ�
��һ�����һ������������N�������е����ֵ��������ֵ��������ȥ������ʣ�µ�����������
�ڶ��н�����Ľ�������
�������룺
4
1 3 4 2
5
2 3 4 5 5
3
1 1 1
���������
4
1 2 3
1
5
��ʾ��
���������ֻ��һ����������һ�н�������󣬵ڶ��������"-1"��
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