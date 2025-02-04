// Patient class to manage hospital patient details
class Patient {
    private static String hospitalName = "City Hospital";  // Static variable shared by all patients
    private static int totalPatients = 0;                   // Counter for total number of patients admitted

    private final int patientID;  // Final variable for unique patient ID
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' keyword to initialize patient details
    public Patient(String name, int age, String ailment) {
        totalPatients++; // Increment total patient count on each new patient
        this.patientID = totalPatients; // Auto-assign unique patient ID
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    // Static method to get total number of patients admitted
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayDetails() {
        if (this instanceof Patient) { // Using instanceof to check if it's a valid Patient object
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("----------------------");
        }
    }

    // Static method to display hospital name
    public static void displayHospitalName() {
        System.out.println("Hospital Name: " + hospitalName);
    }
}

// Main class to execute the program
public class HospitalManagement {
    public static void main(String[] args) {
        // Creating patient objects
        Patient p1 = new Patient("John Doe", 30, "Fever");
        Patient p2 = new Patient("Jane Smith", 45, "Broken Leg");

        // Displaying hospital name and total patients admitted
        Patient.displayHospitalName();
        Patient.getTotalPatients();

        // Displaying patient details
        p1.displayDetails();
        p2.displayDetails();

        // Creating another patient to show updated total patients count
        Patient p3 = new Patient("Emily Davis", 28, "Cold");
        System.out.println("After admitting another patient:\n");

        // Displaying updated total patients and details of all patients
        Patient.getTotalPatients();
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}

