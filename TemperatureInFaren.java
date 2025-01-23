import java.util.Scanner;

public class TemperatureInFaren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println(fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

        scanner.close();
    }
}
