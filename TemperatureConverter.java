import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        double temp = getInput("Enter the temperature: ");
        String unit = getInput("Enter the unit (F for Fahrenheit, C for Celsius): ");

        if (unit.equalsIgnoreCase("F")) {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else if (unit.equalsIgnoreCase("C")) {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid unit entered.");
        }
    }

    // Function to take input from the user
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

