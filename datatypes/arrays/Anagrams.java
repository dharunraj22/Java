package datatypes.arrays;
import java.util.Map;
import java.util.HashMap;

public class Anagrams {
    
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        Map<Character, Integer> freq = new HashMap<>();

        for (int i=0; i<s1.length(); i++) {
            char c = s1.charAt(i);
            if (Character.isWhitespace(c)){
                continue;
            }
            c = Character.toLowerCase(c);
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for (int i=0; i<s2.length(); i++) {
            char c = s2.charAt(i);
            if (Character.isWhitespace(c)) {
                continue;
            }

            c = Character.toLowerCase(c);
            Integer count = freq.get(c);
            if (count == null) {
                return false;
            }
            if (count == 1) {
                freq.remove(c);
            }else {
                freq.put(c, count-1);
            }
        }
        return freq.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "school master";
        String s2 = "the classroom";
        System.out.println("Are " + s1 + " and " + s2 + " anagrams? : " + isAnagram(s1, s2));
    }

}
