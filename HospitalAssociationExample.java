import java.util.ArrayList;
import java.util.List;

// Patient Class
class Patient {
    String name;
    List<Doctor> doctors; // A patient can have multiple doctors

    // Constructor
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Add a doctor for consultation
    void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Establish bidirectional relationship
        }
    }

    // Display Patient Details
    void displayDoctors() {
        System.out.println("\nPatient: " + name + " is consulting with:");
        for (Doctor doc : doctors) {
            System.out.println("  - Dr. " + doc.name + " (Specialization: " + doc.specialization + ")");
        }
    }
}

// Doctor Class
class Doctor {
    String name, specialization;
    List<Patient> patients; // A doctor can have multiple patients

    // Constructor
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Add a patient for consultation
    void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Establish bidirectional relationship
        }
    }

    // Consultation Method (Doctor Communicates with Patient)
    void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting with Patient: " + patient.name);
    }

    // Display Doctor Details
    void displayPatients() {
        System.out.println("\nDr. " + name + " (Specialization: " + specialization + ") is consulting:");
        for (Patient pat : patients) {
            System.out.println("  - Patient: " + pat.name);
        }
    }
}

// Hospital Class (Manages Doctors & Patients)
class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add Doctor
    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add Patient
    void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display Hospital Details
    void displayHospital() {
        System.out.println("\n🏥 Hospital: " + name);

        System.out.println("\nDoctors Available:");
        for (Doctor doc : doctors) {
            System.out.println("  - Dr. " + doc.name + " (Specialization: " + doc.specialization + ")");
        }

        System.out.println("\nPatients Registered:");
        for (Patient pat : patients) {
            System.out.println("  - " + pat.name);
        }
    }
}

// Driver Class
public class HospitalAssociationExample {
    public static void main(String[] args) {
        // Create Hospital
        Hospital hospital = new Hospital("City Care Hospital");

        // Create Doctors
        Doctor drSmith = new Doctor("Smith", "Cardiologist");
        Doctor drWilliams = new Doctor("Williams", "Neurologist");

        // Create Patients
        Patient john = new Patient("John Doe");
        Patient alice = new Patient("Alice Brown");

        // Adding Doctors to Hospital
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drWilliams);

        // Adding Patients to Hospital
        hospital.addPatient(john);
        hospital.addPatient(alice);

        // Establish Association (Consultation)
        john.addDoctor(drSmith);  // John consults Dr. Smith
        alice.addDoctor(drSmith); // Alice also consults Dr. Smith
        alice.addDoctor(drWilliams); // Alice also consults Dr. Williams

        // Perform Consultation
        drSmith.consult(john);
        drSmith.consult(alice);
        drWilliams.consult(alice);

        // Display Details
        hospital.displayHospital();
        drSmith.displayPatients();
        drWilliams.displayPatients();
        john.displayDoctors();
        alice.displayDoctors();
    }
}
