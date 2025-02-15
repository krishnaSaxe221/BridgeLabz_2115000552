public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5}; // Example sorted array
        int target = 2; // Target element to search for

        int[] result = findFirstAndLastOccurrence(arr, target);

        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }

    public static int[] findFirstAndLastOccurrence(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = findFirstOccurrence(arr, target);
        result[1] = findLastOccurrence(arr, target);

        return result;
    }

    // Find the first occurrence of the target
    private static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int firstOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                firstOccurrence = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return firstOccurrence; // Return -1 if not found
    }

    // Find the last occurrence of the target
    private static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                lastOccurrence = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastOccurrence; // Return -1 if not found
    }
}
