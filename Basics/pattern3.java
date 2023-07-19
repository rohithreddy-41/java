public class pattern3 {
    
    public static void main(String[] args) {
        
        // Outer loop for controlling the number of rows
        for (int i = 1; i <= 5; i++) {
            
            // Inner loop for printing the numbers in each row
            for (int j = 1; j <= i; j++) {
				// Print the current number and a comma
                System.out.print(j + ", "); 
            }
            
            // Move to the next line after each row is printed
            System.out.println("");
        }
    }
}
