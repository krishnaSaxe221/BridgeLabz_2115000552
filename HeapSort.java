public class HeapSort {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            swap(salaries, 0, i); // Move current root to end
            heapify(salaries, i, 0); // Heapify the reduced heap
        }
    }

    private static void heapify(int[] salaries, int n, int i) {
        int largest = i; // Root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(salaries, i, largest);
            heapify(salaries, n, largest);
        }
    }

    private static void swap(int[] salaries, int i, int j) {
        int temp = salaries[i];
        salaries[i] = salaries[j];
        salaries[j] = temp;
    }

    public static void main(String[] args) {
        int[] salaryDemands = {60000, 45000, 75000, 50000, 70000};
        heapSort(salaryDemands);

        System.out.print("Sorted Salary Demands: ");
        for (int salary : salaryDemands) {
            System.out.print(salary + " ");
        }
    }
}

