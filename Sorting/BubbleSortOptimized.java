public class BubbleSortOptimized {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 2, 54, 7, 9};
        int n = a.length;
        boolean flag;

        for (int i = 0; i < n; i++) {
            flag = true;  // Set flag to true at the start of each iteration

            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap the elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    // Set flag to false as a swap occurred
                    flag = false;
                }
            }

            // If no elements were swapped, the array is sorted
            if (flag) {
                System.out.println("Array Sorted");
                break;
            }
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
