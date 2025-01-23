import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert pounds to kilograms
        double weightInKg = weightInPounds * 2.2;

        // Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);

        scanner.close();
    }
}
