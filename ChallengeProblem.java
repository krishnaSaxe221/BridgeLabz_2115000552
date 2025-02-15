import java.util.Arrays;

public class ChallengeProblem {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1}; // Example array
        int target = 4; // Target number for binary search

        // Find the first missing positive integer using linear search
        int firstMissingPositive = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + firstMissingPositive);

        // Find the index of the target using binary search
        int index = findTargetIndex(arr, target);
        System.out.println("Index of target " + target + ": " + index);
    }

    // Linear search for the first missing positive integer
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // First, we mark the negative numbers and numbers larger than n as n + 1
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        // Use the array indices to mark the presence of elements
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n && arr[num - 1] > 0) {
                arr[num - 1] = -arr[num - 1]; // Mark as visited
            }
        }

        // Find the first index with a positive value, which is the missing integer
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1; // If all numbers from 1 to n are present
    }

    // Binary search for the target index
    public static int findTargetIndex(int[] arr, int target) {
        // First, sort the array to apply binary search
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return -1; // Target not found
    }
}

