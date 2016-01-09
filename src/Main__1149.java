import java.util.*;
import java.util.Map.Entry;
/*��Ŀ������
����һ��01�ַ��������Ȳ�����100��������ÿһ���Ӵ����ֵĴ�����
���룺
����������У�ÿ��һ���ַ�����
�����
��ÿ���ַ�������������г��ִ�����1�����ϵ��Ӵ�������Ӵ����ֵĴ�����������ֵ�������
�������룺
10101 10110
���������
0 2
01 2
1 3
10 2
101 2
*/

public class Main__1149 {
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
				for(int j=i+1;j<=charArray.length;j++){
					
						String temp = str.substring(i,j);
						if(map.containsKey(temp)){
							Integer value = map.get(temp);
							map.put(temp, value.intValue()+1);
						}else{
							
						   map.put(temp, 1);
						}
					}	
			}
			
			
		
			
			for (Entry<String, Integer> entry : map.entrySet()) {
				if(entry.getValue() >1){
				   System.out.println(entry.getKey() + " " + entry.getValue());
				   
				}
			}
               
			
			
		}
	}
}