import java.util.Scanner;

public class SumOfNaturalNumbers {
    // Method to find the sum of n natural numbers using a loop
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        // Validate the input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calculate the sum
            int result = findSum(n);

            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }
    }
}

