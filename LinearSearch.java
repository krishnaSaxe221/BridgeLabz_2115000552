public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, -2, 4, -7}; // Example array
        int index = findFirstNegative(arr);

        if (index != -1) {
            System.out.println("First negative number is at index: " + index);
        } else {
            System.out.println("No negative number found.");
        }
    }

    public static int findFirstNegative(int[] arr) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // Return the index of the first negative number
            }
        }
        return -1; // Return -1 if no negative number is found
    }
}

