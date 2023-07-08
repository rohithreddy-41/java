public class Stringmethods2 {

    public static void main(String[] args) {
        // Initializing a string
        String str = "www.hotmail.com";
        
        // Finding the length of the string
        System.out.println(str.length());
        
        // Checking if the string starts with "www"
        boolean str1 = str.startsWith("www");
        System.out.println(str1);
        
        // Checking if the string ends with "com"
        boolean str2 = str.endsWith("com");
        System.out.println(str2);
        
        // Getting the character at index 7
        char str3 = str.charAt(7);
        System.out.println(str3);
        
        // Finding the index of 'o' starting from index 6
        int l = str.indexOf('o', 6);
        System.out.println(l);
        
        // Finding the index of the first occurrence of "i"
        System.out.println(str.indexOf("i"));
        
        // Finding the last index of '.'
        System.out.println(str.lastIndexOf('.'));
        
        
    }
}
