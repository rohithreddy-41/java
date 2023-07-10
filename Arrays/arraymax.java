public class arraymax {

    public static void main(String[] args) {
        // Initialize an array of integers
        int a[] = {2, 3, 1, 4, 13, 5, 6, 9};

        // Initialize the maximum value with the first element of the array
        int max = a[0];

        // Iterate over the array to find the maximum value
        for (int i = 0; i < a.length; i++) {
            // Check if the current element is greater than the current maximum
            if (a[i] > max) {
                // If it is, update the maximum value
                max = a[i];
            }
        }

        // Print the maximum value
        System.out.println("max is " + max);
    }
}
