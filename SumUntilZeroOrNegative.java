import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0; // Initialize total to 0.0
        double number;

        // Infinite loop to keep asking the user for numbers
        while (true) {
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            number = scanner.nextDouble();

            if (number <= 0) {
                break; // Exit the loop if the number is 0 or negative
            }

            total += number; // Add the entered number to the total
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}

