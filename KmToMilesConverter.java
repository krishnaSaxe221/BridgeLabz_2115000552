import java.util.Scanner;
public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        // Conversion factor from kilometers to miles
        final double KM_TO_MILES = 1.0 / 1.6;

        // Calculate miles
        double miles = km * KM_TO_MILES;

        // Display the result
        System.out.printf("The total miles is %.2f mile(s) for the given %.2f km.%n", miles, km);

        // Close the scanner
        input.close();
    }

}
