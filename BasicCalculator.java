import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");

        System.out.println("Choose operation: +, -, *, /");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        switch (operation) {
            case "+":
                System.out.println("Result: " + add(num1, num2));
                break;
            case "-":
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case "*":
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    // Function to take input from the user
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Function to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function to divide two numbers
    public static double divide(double a, double b) {
        return a / b;
    }
}

