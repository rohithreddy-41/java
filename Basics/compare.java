public class compare {
    
    public static void main(String[] args) {
        // Declare and initialize string variables
        String str5 = "java";
        String str6 = "java";
        String str7 = new String("java");
        
        // Compare using == operator
        System.out.println(str5 == str7); 
        // Output: false
        // Explanation: The == operator compares object references, not the actual content.
        // Here, str5 and str7 refer to different objects in memory, so the comparison is false.
        
        // Compare using equals() method
        System.out.println(str5.equals(str7)); 
        // Output: true
        // Explanation: The equals() method compares the actual content of the strings.
        // Here, str5 and str7 have the same sequence of characters, "java", so the comparison is true.
        
        // Compare using == operator
        System.out.println(str5 == str6); 
        // Output: true
        // Explanation: Since str5 and str6 are both string literals, they refer to the same object in memory.
        // Therefore, the comparison using == operator is true.
    }
}
