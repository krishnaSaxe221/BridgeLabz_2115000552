import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize sum variable to 0 and store the original number
        int sum = 0;
        int originalNumber = number;

        // Use a while loop to iterate over the digits of the number
        while (number != 0) {
            // Find the last digit of the number (remainder)
            int digit = number % 10;

            // Find the cube of the digit and add it to the sum
            sum += digit * digit * digit;

            // Remove the last digit from the number
            number = number / 10;
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}

