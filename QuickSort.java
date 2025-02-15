
public class QuickSort {
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    private static int partition(double[] prices, int low, int high) {
        double pivot = prices[high]; // Choosing the last element as the pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                swap(prices, i, j);
            }
        }
        swap(prices, i + 1, high);
        return i + 1;
    }

    private static void swap(double[] prices, int i, int j) {
        double temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }

    public static void main(String[] args) {
        double[] productPrices = {399.99, 250.75, 150.50, 500.00, 320.30};
        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.print("Sorted Product Prices: ");
        for (double price : productPrices) {
            System.out.print(price + " ");
        }
    }
}
