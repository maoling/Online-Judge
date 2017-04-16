package com.leetcode;
import java.util.*;
/*

 * */
public class Solution_500 {
	Map<Character,Integer> alphabetMap = new HashMap<>(); 
	private void putChar2Map (String s,int value) {
		for (int i=0;i<s.length();i++) {
			alphabetMap.put(s.charAt(i), value);
		}
	}
	private boolean isPrint(String s){
		
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++){			
			if(alphabetMap.get(s.charAt(i)) != null 
					&& alphabetMap.get(s.charAt(i)) != alphabetMap.get(s.charAt(0)))
			   return false;
		}
		return true;
	}
    public String[] findWords(String[] words) {             
        putChar2Map("qwertyuiop",1);
        putChar2Map("asdfghjkl",2);
        putChar2Map("zxcvbnm",3);
        List<String> res = new LinkedList<>();
        for (int i=0;i<words.length;i++) {
        	if (words[i] == null || words[i].length() == 0) continue;
        	if(isPrint(words[i])){
        		res.add(words[i]);
        	}
        }
        return res.toArray(new String[0]);
    }
	public static void main(String args[]) {
		
		Solution_500 solution = new Solution_500();
		
		System.out.println(solution.findWords(new String[]{"Peace"}));
		/*Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNext()) {
			n = cin.nextInt(); 
			
			
		}*/
	}
}

