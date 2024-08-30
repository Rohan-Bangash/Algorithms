public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is the target
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Sample array
        int target = 30; // The element to search for

        int result = linearSearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
