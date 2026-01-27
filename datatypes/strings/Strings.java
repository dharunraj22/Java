package datatypes.strings;

public class Strings {
    
    public static void main(String[] args) {
        String s = "Hello";
        s = s + " World";   // New object is created. Immutable
        // s[1] = 't';  Not possible
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello");  // Mutable, but the utility functions are not thread safe
        sb.append(" Worll");
        sb.setCharAt(sb.length()-1, 'd');
        System.out.println(s);

        StringBuffer sbf = new StringBuffer("Hello"); // Mutable, thread safe utility functions, but slower than StringBuilder
        sbf.append(" Worll");
        sbf.setCharAt(sbf.length()-1, 'd');
        System.out.println(sbf);
    }

}
