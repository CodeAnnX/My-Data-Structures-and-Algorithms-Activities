public class QuickSort {

    // Function to perform QuickSort
    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(nums, start, end);

            // Recursively sort elements before and after partition
            quickSort(nums, start, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, end);
        }
    }

    // Function to partition the array and place the pivot in the correct position
    public static int partition(int[] nums, int start, int end) {
        // Pivot element is selected to be the last element in the array
        int pivotElement = nums[end];
        int smallerElementIndex = (start - 1); // Index of the smaller element

        // Traverse through the array, rearranging elements based on pivot
        for (int current = start; current < end; current++) {
            // If current element is smaller than the pivot, swap it
            if (nums[current] < pivotElement) {
                smallerElementIndex++;
                // Swap nums[smallerElementIndex] and nums[current]
                int temp = nums[smallerElementIndex];
                nums[smallerElementIndex] = nums[current];
                nums[current] = temp;
            }
        }

        // Place the pivot in its correct position
        int temp = nums[smallerElementIndex + 1];
        nums[smallerElementIndex + 1] = nums[end];
        nums[end] = temp;

        // Return the index of the pivot
        return smallerElementIndex + 1;
    }

    // Utility function to print the array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test QuickSort
    public static void main(String[] args) {
        int[] numbers = { 10, 7, 8, 9, 1, 5 };

        System.out.println("Original array:");
        printArray(numbers);

        // Perform QuickSort
        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
        }
