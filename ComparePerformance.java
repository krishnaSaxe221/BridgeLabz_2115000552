import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.time.Duration;
import java.time.Instant;

public class ComparePerformance {
    public static void main(String[] args) {
        // Strings to concatenate
        String str = "hello";
        int times = 1_000_000;

        // Measure StringBuilder concatenation time
        Instant start = Instant.now();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            stringBuilder.append(str);
        }
        Instant end = Instant.now();
        System.out.println("StringBuilder time: " + Duration.between(start, end).toMillis() + "ms");

        // Measure StringBuffer concatenation time
        start = Instant.now();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < times; i++) {
            stringBuffer.append(str);
        }
        end = Instant.now();
        System.out.println("StringBuffer time: " + Duration.between(start, end).toMillis() + "ms");

        // FileReader and BufferedReader for word count
        String filePath = "path_to_your_large_file.txt"; // Specify your large file path
        File file = new File(filePath);
        if (file.exists() && file.length() > 0) {
            try {
                // FileReader setup (no need for InputStreamReader)
                start = Instant.now();
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                // Word count logic
                int wordCount = 0;
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                }
                end = Instant.now();
                System.out.println("Word count: " + wordCount);
                System.out.println("File reading time: " + Duration.between(start, end).toMillis() + "ms");

                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File not found or empty!");
        }
    }
}
