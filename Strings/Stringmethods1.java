public class Stringmethods1 {

    public static void main(String[] args) {
        // Finding the length of a string
        String str = "HelloWorld";
        int l = str.length();
        System.out.println(l);
        
        // Converting the string to lowercase
        str = str.toLowerCase();
        System.out.println(str);
        
        // Converting the string to uppercase
        str = str.toUpperCase();
        System.out.println(str);
        
        // Trimming leading and trailing whitespace from a string
        String str1 = "        program  ";
        System.out.println(str1);
        str1 = str1.trim();
        System.out.println(str1);
        
        // Extracting a substring from a string
        String str2 = "Java program";
        String sub = str2.substring(3, 6);
        System.out.println(sub);
        
        // Replacing characters in a string
        String str4 = "welcome";
        str4 = str4.replace('e', 'k');
        System.out.println(str4);
    }
}
