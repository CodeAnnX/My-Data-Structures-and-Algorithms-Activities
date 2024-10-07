public class BinarySearch {

    // Binary Search method
    public static int binarySearch(int[] array, int target) {
        int left = 0; // Left boundary
        int right = array.length - 1; // Right boundary

        // While the left boundary is less than or equal to the right boundary
        while (left <= right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid; // Return the index if found
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11}; // Sorted array
        int target = 7; // Element to search for

        // Call binarySearch and store the result
        int result = binarySearch(numbers, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
        }
