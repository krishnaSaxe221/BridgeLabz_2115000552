import java.util.Scanner;

public class FactorialCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize factorial to 1
            long factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}

