import java.util.Random;

public class Randomnumbers {
    public static void main(String[] args) {
        // Create a new instance of the Random class
        Random random = new Random();

        // Generate and print 10 random integers between 0 and 100 (inclusive)
        for (int i = 0; i < 10; i++) {
			// Generates a random integer between 0 and 100
            int randomNumber = random.nextInt(101); 
            System.out.println(randomNumber);
        }
    }
}
