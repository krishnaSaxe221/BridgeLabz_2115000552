
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking year input from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if year is greater than or equal to 1582
        if (year >= 1582) {
            // Check if year is divisible by 4
            if (year % 4 == 0) {
                // Check if year is divisible by 100
                if (year % 100 == 0) {
                    // Check if year is divisible by 400
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
        }

        scanner.close();
    }
}
