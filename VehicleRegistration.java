// Vehicle class to manage vehicle registration details
class Vehicle {
    private static double registrationFee = 500.0; // Static variable shared by all vehicles
    private static int vehicleCount = 0;           // Counter for the number of vehicles created

    private final String registrationNumber;  // Final variable for unique registration number
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' keyword to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        vehicleCount++; // Increment the count of vehicles
        this.registrationNumber = "V" + vehicleCount;  // Auto-assign unique registration number
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle registration details
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) { // Using instanceof to check if it's a valid Vehicle object
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
            System.out.println("----------------------");
        }
    }

    // Static method to display the current registration fee
    public static void displayRegistrationFee() {
        System.out.println("Current Registration Fee: $" + registrationFee);
    }
}

// Main class to execute the program
public class VehicleRegistration {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle v1 = new Vehicle("John Doe", "Car");
        Vehicle v2 = new Vehicle("Jane Smith", "Motorcycle");

        // Displaying registration fee and details of vehicles
        Vehicle.displayRegistrationFee();
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();

        // Updating registration fee
        Vehicle.updateRegistrationFee(600.0);
        System.out.println("Updated Registration Fee:\n");

        // Displaying updated registration details
        Vehicle.displayRegistrationFee();
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
    }
}

