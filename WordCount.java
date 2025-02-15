import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "F:\\ReviewCodes\\MethodOverRiding.txt";
        String targetWord = "public";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words using space as delimiter
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) { // Check if the word matches (case-insensitive)
                        wordCount++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' occurred " + wordCount + " times.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

