import java.util.ArrayList;
import java.util.List;

// Faculty Class (Independent, Aggregation with University)
class Faculty {
    String name;
    String specialization;

    // Constructor
    public Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    // Display Faculty Details
    void displayFaculty() {
        System.out.println("  Faculty: " + name + " | Specialization: " + specialization);
    }
}

// Department1 Class (Dependent on University, Composition)
class Department1 {
    String deptName;

    // Constructor
    public Department1(String deptName) {
        this.deptName = deptName;
    }

    // Display Department1
    void displayDepartment1() {
        System.out.println("Department1: " + deptName);
    }
}

// University Class (Composition with Department1, Aggregation with Faculty)
class University {
    String universityName;
    List<Department1> Department1s; // Composition (Cannot Exist Without University)
    List<Faculty> facultyMembers; // Aggregation (Can Exist Independently)

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.Department1s = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Add a Department1 (Composition)
    void addDepartment1(String deptName) {
        Department1s.add(new Department1(deptName));
    }

    // Add a Faculty Member (Aggregation)
    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Display University Details
    void displayUniversity() {
        System.out.println("\nUniversity: " + universityName);

        System.out.println("Department1s:");
        for (Department1 dept : Department1s) {
            dept.displayDepartment1();
        }

        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            faculty.displayFaculty();
        }
    }
}

// Driver Class
public class UniversityCompositionExample {
    public static void main(String[] args) {
        // Create University
        University university = new University("Oxford University");

        // Add Department1s (Composition)
        university.addDepartment1("Computer Science");
        university.addDepartment1("Physics");
        university.addDepartment1("Mathematics");

        // Create Faculty Members (Independent Objects)
        Faculty profSmith = new Faculty("Dr. Smith", "Artificial Intelligence");
        Faculty profJohnson = new Faculty("Dr. Johnson", "Quantum Mechanics");

        // Add Faculty to University (Aggregation)
        university.addFaculty(profSmith);
        university.addFaculty(profJohnson);

        // Display University Structure
        university.displayUniversity();

        // Deleting University (Implied, Since Java Handles Garbage Collection)
        university = null;  // All Department1s are also deleted, but Faculty members remain
    }
}

