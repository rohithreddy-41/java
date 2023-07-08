public class Stringbasics {

    public static void main(String[] args) {
        // Creating a string using string literal
        String str = "java programming";
        System.out.println(str);
        
        // Creating a string using the 'new' keyword
        String str1 = new String("java");
        System.out.println(str1);
        
        // Creating a string from a character array
        char c[] = {'a', 'p', 'p', 'l', 'e'};
        String str2 = new String(c, 0, 5);
        System.out.println(str2);
        
        // Creating a string from a byte array
        byte b[] = {65, 66, 67, 68, 69};
        String str3 = new String(b, 0, 2);
        System.out.println(str3);
        
        // Comparing strings
        String str5 = "java";
        String str6 = "java";
        String str7 = new String("java");
        
        // Comparing references using '==' operator
        // false (different objects)
        System.out.println(str5 == str7); 
        // true (same object in string pool)
        System.out.println(str5 == str6); 
        
        // Comparing values using 'equals' method
        // true (same content)
        System.out.println(str5.equals(str7)); // true (same content)
    }
}
