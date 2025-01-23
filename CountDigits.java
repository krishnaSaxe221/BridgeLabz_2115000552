import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize count variable to 0
        int count = 0;

        // Use a while loop to count the digits
        while (number != 0) {
            // Remove the last digit by dividing the number by 10
            number = number / 10;
            count++; // Increase the count by 1
        }

        // If the input number was 0, count should be 1
        if (count == 0) {
            count = 1;
        }

        // Display the count of digits
        System.out.println("The number of digits is: " + count);

        scanner.close();
    }
}

