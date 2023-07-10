public class arraymin {

    public static void main(String[] args) {
        // Initialize an array of integers
        int a[] = {2, 34, 44, 41, 1, 6, 7, 9};

        // Initialize the minimum value with the first element of the array
        int min = a[0];

        // Iterate over the array to find the minimum value
        for (int i = 0; i < a.length; i++) {
            // Check if the current element is smaller than the current minimum
            if (a[i] < min) {
                // If it is, update the minimum value
                min = a[i];
            }
        }

        // Print the minimum value
        System.out.println(min);
    }
}
