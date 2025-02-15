
public class RotationPointFinder {
    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 15, 19, 2, 3};  // Example rotated sorted array
        int rotationPointIndex = findRotationPoint(arr);

        System.out.println("The rotation point is at index: " + rotationPointIndex);
        System.out.println("The smallest element is: " + arr[rotationPointIndex]);
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // Binary search to find the rotation point
        while (left < right) {
            int mid = (left + right) / 2;

            // If the mid element is greater than the right element, the smallest element is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // If the mid element is less than the right element, the smallest element is in the left half
                right = mid;
            }
        }

        // When left equals right, we've found the rotation point
        return left;
    }
}
