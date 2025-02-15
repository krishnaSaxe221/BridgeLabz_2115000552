public class MergeSort {
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    private static void merge(double[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArr = new double[n1];
        double[] rightArr = new double[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = prices[left + i];
        for (int i = 0; i < n2; i++) rightArr[i] = prices[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                prices[k++] = leftArr[i++];
            } else {
                prices[k++] = rightArr[j++];
            }
        }

        while (i < n1) prices[k++] = leftArr[i++];
        while (j < n2) prices[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        double[] bookPrices = {299.99, 150.50, 499.00, 199.75, 350.25};
        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.print("Sorted Book Prices: ");
        for (double price : bookPrices) {
            System.out.print(price + " ");
        }
    }
}
