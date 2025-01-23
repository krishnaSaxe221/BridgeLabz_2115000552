import java.util.Scanner;

public class NaturalNumberSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute the sum using the formula n*(n+1)/2
            int formulaSum = (n * (n + 1)) / 2;

            // Compute the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare the results
            System.out.println("Sum using the formula: " + formulaSum);
            System.out.println("Sum using the for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There seems to be an error in the computations.");
            }
        }

        scanner.close();
    }
}

