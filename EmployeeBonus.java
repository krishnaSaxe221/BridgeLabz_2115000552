import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take salary and years of service as input
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Calculate and print the bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;  // 5% bonus
            System.out.println("The employee is eligible for a bonus of: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        scanner.close();
    }
}

