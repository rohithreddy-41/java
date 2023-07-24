public class arraydelete {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 9, 4, 5};

        // Loop to shift the elements after the deletion point
        for (int i = 4; i <= a.length - 1; i++) {
            a[i - 1] = a[i];
        }

         // Loop to print the modified array after deletion
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
