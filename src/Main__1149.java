import java.util.*;
import java.util.Map.Entry;
/*题目描述：
给出一个01字符串（长度不超过100），求其每一个子串出现的次数。
输入：
输入包含多行，每行一个字符串。
输出：
对每个字符串，输出它所有出现次数在1次以上的子串和这个子串出现的次数，输出按字典序排序。
样例输入：
10101 10110
样例输出：
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
	                        // 升序排序
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