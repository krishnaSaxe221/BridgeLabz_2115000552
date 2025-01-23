import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangle (in meters)
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters (5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds required
        double rounds = totalDistance / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + rounds);

        scanner.close();
    }
}
