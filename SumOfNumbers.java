import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0; // Initialize total to 0.0
        double number;

        // Continue asking the user for numbers until they enter 0
        while (true) {
            System.out.print("Enter a number (enter 0 to stop): ");
            number = scanner.nextDouble();

            if (number == 0) {
                break; // Exit the loop if the user enters 0
            }

            total += number; // Add the entered number to the total
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}

