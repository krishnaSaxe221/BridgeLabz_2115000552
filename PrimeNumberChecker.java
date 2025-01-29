import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Take input from the user
        int number = getInput("Enter a number to check if it's prime: ");

        // Check if the number is prime
        boolean isPrime = isPrime(number);

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // Prime number
    }
}

