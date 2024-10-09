import java.util.Scanner;

public class InsertionSort {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        // Loop through each element in the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // The element we want to insert into the sorted part
            int j = i - 1;     // Start comparing with the element before the key

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift the element to the right
                j--;  // Move to the next element on the left
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        
        // Prompt user for input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // Read the number of elements

        int[] arr = new int[n]; // Create an array of the specified size
        
        // Read the array elements from user input
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Fill the array with user input
        }

        // Call the insertion sort method
        insertionSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " "); // Print each element of the sorted array
        }

        scanner.close(); // Close the scanner to free resources
    }
}
