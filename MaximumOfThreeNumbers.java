import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        // Take input from the user
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        // Calculate the maximum number
        int max = findMaximum(num1, num2, num3);

        // Output the result
        System.out.println("The maximum number is: " + max);
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;  // Assume num1 is the maximum initially

        // Compare num2 and num3 to find the maximum
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        return max;
    }
}

