import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

        scanner.close();
    }
}
