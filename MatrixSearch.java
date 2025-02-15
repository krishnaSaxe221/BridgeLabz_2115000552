public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }; // Example 2D matrix
        int target = 3; // The target value to search for
        boolean result = searchMatrix(matrix, target);

        System.out.println("Target found: " + result);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; // Return false if the matrix is empty
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Treat the 2D matrix as a 1D array
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert mid to row and column indices
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true; // Target found
            }
            if (midValue < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return false; // Target not found
    }
}
