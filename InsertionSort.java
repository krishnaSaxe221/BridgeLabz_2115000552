
public class InsertionSort {
    public static void insertionSort(int[] empIds) {
        int n = empIds.length;
        for (int i = 1; i < n; i++) {
            int key = empIds[i];
            int j = i - 1;
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j]; // Shift elements
                j--;
            }
            empIds[j + 1] = key; // Insert key at correct position
        }
    }

    public static void main(String[] args) {
        int[] empIds = {105, 102, 110, 101, 108};
        insertionSort(empIds);
        System.out.print("Sorted Employee IDs: ");
        for (int id : empIds) {
            System.out.print(id + " ");
        }
    }
}
