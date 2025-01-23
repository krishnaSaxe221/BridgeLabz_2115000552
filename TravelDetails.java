import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input personal and travel details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your departure city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter your via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();

        // Input distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        // Input time taken in hours
        System.out.print("Enter the time taken for the trip in hours: ");
        double timeTaken = scanner.nextDouble();

        // Calculate total distance
        double totalDistance = fromToVia + viaToFinalCity;

        // Calculate average speed
        double averageSpeed = totalDistance / timeTaken;

        // Display the results
        System.out.println("\nTravel details for " + name + ":");
        System.out.println("From city: " + fromCity);
        System.out.println("Via city: " + viaCity);
        System.out.println("To city: " + toCity);
        System.out.println("Total distance traveled: " + totalDistance + " miles");
        System.out.println("Average speed during the trip: " + averageSpeed + " miles per hour");

        scanner.close();
    }
}
