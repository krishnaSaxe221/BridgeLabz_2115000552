import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int number = getInput("Enter a number to calculate its factorial: ");
        int result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Function to take input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to calculate factorial using recursion
    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }
}

