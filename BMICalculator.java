import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        // Input height in centimeters
        System.out.print("Enter height (in cm): ");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Print BMI and weight status
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Weight status: " + status);
    }
}
