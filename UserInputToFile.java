
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInputToFile {
    public static void main(String[] args) {
        String filePath = "F:\\ReviewCodes\\user_input.txt"; // Specify the file path
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(filePath, true)) { // 'true' for appending
            String userInput;
            System.out.println("Enter text to write to the file. Type 'exit' to stop:");

            while (!(userInput = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(userInput + System.lineSeparator()); // Write each line to the file
            }
            System.out.println("Input has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
