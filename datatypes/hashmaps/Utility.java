package datatypes.hashmaps;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Utility {
    
    public static Map<Character, Integer> countCharacters(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            count.merge(curr, 1, Integer::sum); //count.merge(c, 1, (oldVal, newVal) -> oldVal * 2);   
        }
         return count;
    } 

    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character, Integer> count = countCharacters(str);
        for (char c : count.keySet()) {
            System.out.println("Frequency of " + c + " is " + count.get(c));
        }
    }

}
