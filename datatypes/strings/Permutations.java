package datatypes.strings;
import java.util.Map;
import java.util.HashMap;

public class Permutations {
    
    public static boolean isPermutation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s1.toCharArray()) {
            freq.merge(c, 1, Integer::sum);
        }

        for (char c : s2.toCharArray()) {
            if(!freq.containsKey(c)) {
                return false;
            }
            int c_freq = freq.get(c);
            if (c_freq == 1) {
                freq.remove(c);
            }else {
                freq.put(c, c_freq-1);
            }
        }

        return freq.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "sca";
        String s2 = "cas";
        System.out.println("Are the given two strings permutations? : " + isPermutation(s1, s2));
    }

}
