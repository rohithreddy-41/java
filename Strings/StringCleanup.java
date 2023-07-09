
public class StringCleanup {

    public static void main(String[] args) {
        // Removing special characters from a string
        String str = "a@bc%$12%^&";
        String a = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(a);
        
        // Removing all spaces from a string
        String str1 = "       ab  c d   e     f  ";
        String b = str1.replaceAll(" ", "");
        System.out.println(b);
        
        // Replacing consecutive spaces with a single space
        String c = str1.replaceAll("\\s+", " ").trim();
        //It removes starting and ending spaces as well
        System.out.println(c);
        
        // Finding the number of words in a string
        String s = "ab cd ef fh i l";
        String words[] = s.split("\\s");
        System.out.println(words.length);
        
        // Finding the length of a string
        String m = "abcdefghijk";
        System.out.println(m.length());
    }
}
