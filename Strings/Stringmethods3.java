import java.util.*;

public class Stringmethods3 {

    public static void main(String[] args) {
        // Initializing strings
        String str1 = "Java";
        String str2 = "python";
        String str3 = "Java";
        
        // Comparing strings for equality
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        
        // Comparing strings lexicographically
        System.out.println("compare");
        String str4 = new String("Java programming");
        System.out.println(str2.compareTo(str1)); // -14 (comparison result)
        
        // Comparing strings using '==' and 'equals'
        System.out.println("equals");
        String a = "hellloworld";
        String b = "helloworld";
        String scan = new String("helloworld");
        System.out.println(a == b); // false
        System.out.println(a == scan); // false (different objects)
        
        // Checking if a string contains a substring
        String h = "the gate wall ";
        String m = "of china is large";
        System.out.println(h.contains("wall")); // true
        
        // Concatenating strings using 'concat' method
        System.out.println(h.concat(m));
        
        // Concatenating strings using '+' operator
        System.out.println(h + m);
    }
}
