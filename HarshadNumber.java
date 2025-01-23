import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize sum variable to 0
        int sum = 0;
        int originalNumber = number;

        // Use a while loop to access each digit of the number
        while (number != 0) {
            // Add the last digit to the sum
            sum += number % 10;
            // Remove the last digit from the number
            number = number / 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        scanner.close();
    }
}

