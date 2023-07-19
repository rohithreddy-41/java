
public class Ascii {
    public static void main(String[] args) {
        for (int i = 0; i <= 127; i++) {
			 // Convert the integer value to its corresponding character
            char c = (char) i; 
            
            // Print the ASCII value and corresponding character
            System.out.println("ASCII value: " + i + ", Character: " + c);
        }
    }
}
