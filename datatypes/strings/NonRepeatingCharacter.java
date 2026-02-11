package datatypes.strings;

public class NonRepeatingCharacter {
    
    //Time complexity: O(n^2)
    public static char firstNonRepeatingCharacter(String s1) {
        if (s1 == null) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }
        int len = s1.length();
        for (int i=0; i<len; i++) {
            boolean isRepeating = false;
            char curr = s1.charAt(i);
            for (int j=0; j<len; j++) {
                if (i != j && curr == s1.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return curr;
            }
        }
        return '\0';
    }

}
