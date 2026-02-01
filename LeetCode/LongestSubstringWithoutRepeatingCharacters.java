package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0;
        int len = s.length();
        int left = 0;
        for (int right=0; right<len; right++) {
            char curr = s.charAt(right);
            if (!charMap.containsKey(curr) || charMap.get(curr) < left) {
                maxLength = Math.max(maxLength, right-left+1);
            }else {
                left = charMap.get(curr) + 1;
            }
            charMap.put(curr, right);
        }
        return maxLength;
    }
}
