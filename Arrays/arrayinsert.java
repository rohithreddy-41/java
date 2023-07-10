public class arrayinsert {

    public static void main(String[] args) {
        int a[] = new int[10]; // Initialize a new integer array with size 10

        // Initialize some initial values in the array
        a[0] = 2;
        a[1] = 3;
        a[2] = 5;
        a[3] = 6;
        a[4] = 7;

        // Current number of elements in the array
        int n = 5; 
         // Value to be inserted
        int t = 4;
         // Index at which the value should be inserted
        int index = 2;

        // Shift the elements to the right from index 'index' to make space for the new value
        for (int i = n; i > index; i--) {
            a[i] = a[i - 1];
        }

        // Insert the new value at the specified index
        a[index] = t;

        // Print the modified array
        for (int i = 0; i <= n; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
