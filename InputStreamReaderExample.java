import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        String filePath = "F:\\ReviewCodes\\MethodOverRiding.txt";
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print each line as characters
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

