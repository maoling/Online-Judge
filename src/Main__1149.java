import java.util.*;
import java.util.Map.Entry;
/*题目描述：
给出一个01字符串（长度不超过100），求其每一个子串出现的次数。
输入：
输入包含多行，每行一个字符串。
输出：
对每个字符串，输出它所有出现次数在1次以上的子串和这个子串出现的次数，输出按字典序排序。
样例输入：
10101
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
		Map<String, Integer> map = new HashMap<String, Integer>();

		while (cin.hasNext()) {
			
			str = cin.nextLine(); 
			char charArray[] = str.toCharArray();
			
			for(int i=0;i<charArray.length;i++){
				for(int j=i+1;j<=charArray.length;j++){				
					String temp = str.substring(i,j);//substring 不包括endIndex位置的字符
					if(map.containsKey(temp)){
						Integer value = map.get(temp);
						map.put(temp, value.intValue()+1);
					}else{						
					   map.put(temp, 1);
					}
				}	
			}
			
			
			List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(map.entrySet());
					
			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {		
			    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {			
			        return (o2.getValue() - o1.getValue());			
			    }
			
			});
			
			for (Entry<String, Integer> entry : map.entrySet()) {
				if(entry.getValue() >1){
				   System.out.println(entry.getKey() + " " + entry.getValue());
				   
				}
			}
               
			
			
		}
	}
}