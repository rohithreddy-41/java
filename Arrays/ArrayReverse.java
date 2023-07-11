public class ArrayReverse {
    public static void main(String[] args) {
        // Reverse an array

        // Declare and initialize the array
        int a[] = {2, 3, 4, 5, 6,7};

        // Iterate through the array in reverse order
        for (int i = a.length - 1; i >= 0; i--) {
        // Print the element at the current index
            System.out.println(a[i]);
        }
    }
}
