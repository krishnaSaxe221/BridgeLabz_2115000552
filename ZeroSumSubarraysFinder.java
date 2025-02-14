import java.util.*;

class ZeroSumSubarraysFinder { // Unique class name

    // Function to find all subarrays with zero sum
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        // Initialize with sum 0 at index -1 for subarrays starting from index 0
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum is found again, subarrays exist from previous indices to i
            if (sumMap.containsKey(sum)) {
                for (int startIdx : sumMap.get(sum)) {
                    result.add(new int[]{startIdx + 1, i});
                }
            }

            // Store index for current sum
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }

    // Main function to test the implementation
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 2, -6, 3, 1, -4, 2};

        List<int[]> subarrays = findZeroSumSubarrays(arr);

        // Print the result
        System.out.println("Zero sum subarrays:");
        for (int[] subarray : subarrays) {
            System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
        }
    }
}

