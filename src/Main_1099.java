import java.util.*;
import java.util.Map.Entry;
/*
 * ��Ŀ������
����һ���ַ����������׺�Ӵ�������������grain
���Ӵ��У�
grain 
rain 
ain 
in 
n
Ȼ��Ը��Ӵ����ֵ�˳�����򣬼��� 
ain,grain,in,n,rain
���룺
ÿ������Ϊһ���ַ�����
�����
���Ӵ��������
�������룺
grain
���������
ain
grain
in
n
rain*/
public class Main_1099 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String str ;	
		
		while (cin.hasNext()) {
				//Map<String, Integer> map = new HashMap<String, Integer>();
				Map<String, Integer> map = new TreeMap<String, Integer>(
		                new Comparator<String>() {
		                    public int compare(String obj1, String obj2) {
		                        // ��������
		                        return obj1.compareTo(obj2);
		                    }
		                });
				
				str = cin.nextLine(); 
				char charArray[] = str.toCharArray();
				
				for(int i=0;i<charArray.length;i++){				
						String temp = str.substring(i,charArray.length);//substring ������endIndexλ�õ��ַ�					
						map.put(temp, 1);										
				}
				
				for (Entry<String, Integer> entry : map.entrySet()) {				
					   System.out.println(entry.getKey());				   
				}
				
			}
               						
		}
}
