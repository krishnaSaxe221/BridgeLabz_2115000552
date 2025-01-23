import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking year input from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Single if condition to check if the year is a Leap Year or not
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
        }

        scanner.close();
    }
}
