import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Perform the operations
        double result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c; // Multiplication (*) has higher precedence than addition (+)
        double result3 = c + a / b; // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c; // Modulus (%) has higher precedence than addition (+)

        // Display the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}
