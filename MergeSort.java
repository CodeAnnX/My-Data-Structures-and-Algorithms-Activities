public class MergeSort {

    // Function to perform Merge Sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point to divide the array into two halves
            int mid = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    // Function to merge two halves of an array
    public static void merge(int[] array, int left, int mid, int right) {
        // Calculate the sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + 1 + j];
        }

        // Initial indexes of the first and second subarrays
        int i = 0, j = 0;

        // Initial index of the merged subarray
        int k = left;

        // Merge the temporary arrays back into the original array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of L[], if any
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Copy any remaining elements of R[], if any
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the Merge Sort implementation
    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };

        System.out.println("Original array:");
        printArray(array);

        // Perform Merge Sort
        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        printArray(array);
    }
          }
