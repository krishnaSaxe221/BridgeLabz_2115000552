public class PeakElementFinder {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0}; // Example array
        int peakIndex = findPeakElement(arr);

        System.out.println("The peak element is at index: " + peakIndex);
        System.out.println("The peak element is: " + arr[peakIndex]);
    }

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid])) {
                return mid; // Peak element found
            }
            // If the left neighbor is greater, search the left half
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // If the right neighbor is greater, search the right half
            else {
                left = mid + 1;
            }
        }

        return -1; // This should never be reached for a valid array
    }
}

