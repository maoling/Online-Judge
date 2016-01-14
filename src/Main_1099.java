import java.util.*;
import java.util.Map.Entry;
/*
 * 题目描述：
对于一个字符串，将其后缀子串进行排序，例如grain
其子串有：
grain 
rain 
ain 
in 
n
然后对各子串按字典顺序排序，即： 
ain,grain,in,n,rain
输入：
每个案例为一行字符串。
输出：
将子串排序输出
样例输入：
grain
样例输出：
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
		                        // 升序排序
		                        return obj1.compareTo(obj2);
		                    }
		                });
				
				str = cin.nextLine(); 
				char charArray[] = str.toCharArray();
				
				for(int i=0;i<charArray.length;i++){				
						String temp = str.substring(i,charArray.length);//substring 不包括endIndex位置的字符					
						map.put(temp, 1);										
				}
				
				for (Entry<String, Integer> entry : map.entrySet()) {				
					   System.out.println(entry.getKey());				   
				}
				
			}
               						
		}
}
