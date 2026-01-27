package datatypes.strings;

public class StringUtility {
    
    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        StringBuilder reversed = new StringBuilder(str.length());
        for (int i=str.length()-1; i>=0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        int len = str.length();
        for (int i=0; i<len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u' ;
    }

    public static int countVowels(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            char current = Character.toLowerCase(str.charAt(i));
                if (isVowel(current)) {
                    count++;
                }
        }
        return count;
    }

    public static int countConsonants(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        int count=0;

        for (int i=0; i<str.length(); i++) {
            char current = Character.toLowerCase(str.charAt(i));
            if (current >= 'a' && current <= 'z' && !isVowel(current)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "1racecar1";
        String reversed = reverseString(str);
        System.out.println("Reversed String of " + str + " is: " + reversed);
        System.out.println("Is the string " + str + " a palindrome? " + isPalindrome(str));
        System.out.println("Number of vowels in " + str + " is: " + countVowels(str));
        System.out.println("Number of consonants in " + str + " is: " + countConsonants(str));
    }

}
