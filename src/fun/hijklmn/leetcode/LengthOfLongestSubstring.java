package fun.hijklmn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @Desc 不重复字符的长度 	
 * @author GuoFusong
 * @Datetime 2019年6月12日下午1:52:56
 */
public class LengthOfLongestSubstring {
	
	public static void main(String[] args) {
		String str = "pwwkew";
		System.out.println(lengthOfLongestSubstring(str));
	}

	public static int lengthOfLongestSubstring(String str) {
		
		if (str == null || "".equals(str)) return 0; 
		
		Map<Character, Integer> map = new HashMap<>();
		
		int tempIndex = 0;
		
		int len = 0;
		
		for (int i=0; i<str.length(); i++) {
			
			if (map.containsKey(str.charAt(i))) {
				
				int tempInd = map.get(str.charAt(i));
				
				if (tempIndex <= tempInd) {
					
					if (i - tempInd > len) {
						len = i - tempInd;
					}
					
					tempIndex = tempInd;
					
				}
				
			} else {
				len = i - tempIndex;
			}

			map.put(str.charAt(i), i);
			
		}
		
		return len;
		
	} 
	
}
