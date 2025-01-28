import java.util.Scanner;

public class BMIcalculator {

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            // Convert height from cm to meters
            double heightInMeters = data[i][1] / 100;
            // Calculate BMI using the formula BMI = weight / (height * height)
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine the BMI status based on BMI value
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight (kg), height (cm), and BMI
        double[][] data = new double[10][3];

        // Get the weight and height for each person and store them in the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine the BMI status for each person
        String[] status = determineBMIStatus(data);

        // Display the BMI, status, and other details for each person
        System.out.println("\nBMI Calculation Results:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight: " + data[i][0] + " kg");
            System.out.println("Height: " + data[i][1] + " cm");
            System.out.println("BMI: " + String.format("%.2f", data[i][2]));
            System.out.println("Status: " + status[i]);
            System.out.println();
        }
    }
}

