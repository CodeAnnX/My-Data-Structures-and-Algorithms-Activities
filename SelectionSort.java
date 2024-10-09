import java.util.Scanner;

public class SelectionSort {
    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Length of the array

        // Traverse through all elements in the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum

            // Find the minimum element in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Ask user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // Get the number of elements

        int[] arr = new int[n]; // Create an array of size 'n'

        // Input the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform selection sort
        selectionSort(arr);

        // Output the sorted array
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close(); // Close the scanner
    }
          }
