import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Check if the first number is the largest
        System.out.println("Is the first number the largest? " + (number1 >= number2 && number1 >= number3));

        // Check if the second number is the largest
        System.out.println("Is the second number the largest? " + (number2 >= number1 && number2 >= number3));

        // Check if the third number is the largest
        System.out.println("Is the third number the largest? " + (number3 >= number1 && number3 >= number2));

        scanner.close();
    }
}

