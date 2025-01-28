public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Test cases to demonstrate the conversion methods
        double yards = 10;
        double feet = 15;
        double meters = 5;
        double inches = 20;

        // Converting yards to feet
        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");

        // Converting feet to yards
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");

        // Converting meters to inches
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");

        // Converting inches to meters
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");

        // Converting inches to centimeters
        System.out.println(inches + " inches is equal to " + convertInchesToCm(inches) + " centimeters.");
    }
}

