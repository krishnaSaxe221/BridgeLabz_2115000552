// University Management System
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter and Setter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

// Subclass demonstrating protected member access
class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", Specialization: " + specialization);
    }
}

public class Students {
    public static void main(String[] args) {
        // Creating Student Objects
        Student student1 = new Student(101, "Alice", 3.8);
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 3.9, "Computer Science");

        student1.displayStudentDetails();
        pgStudent.displayPostgraduateDetails();

        // Modifying CGPA
        student1.setCGPA(3.85);
        System.out.println("Updated CGPA: " + student1.getCGPA());
    }
}
