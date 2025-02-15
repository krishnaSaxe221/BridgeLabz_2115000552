public class SelectionSort {
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            swap(scores, i, minIndex);
        }
    }

    private static void swap(int[] scores, int i, int j) {
        int temp = scores[i];
        scores[i] = scores[j];
        scores[j] = temp;
    }

    public static void main(String[] args) {
        int[] examScores = {78, 92, 85, 63, 89};
        selectionSort(examScores);

        System.out.print("Sorted Exam Scores: ");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}

