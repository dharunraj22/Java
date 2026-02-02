package LeetCode;

public class ValidAnagram {
    
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        int unmatched=0;
        for (char c : s.toCharArray()) {
            freq[c-'a']++;
            unmatched++;
        }
        for (char c : t.toCharArray()) {
            if (freq[c-'a'] == 0) {
                return false;
            }
            freq[c-'a']--;
            unmatched--;
        }
        return unmatched==0;
    }
}
