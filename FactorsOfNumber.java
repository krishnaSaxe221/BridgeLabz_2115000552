
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Factors of " + number + " are:");

        // Loop to find factors
        for (int i = 1; i <= number; i++) {  // Loop from 1 to the number
            if (number % i == 0) {  // Check if 'number' is divisible by 'i'
                System.out.println(i);  // Print the factor
            }
        }
    }
}
