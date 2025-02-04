// StudentDetails class to manage student data
class StudentDetails {
    private static String universityName = "ABC University"; // Static variable shared by all students
    private static int totalStudents = 0;  // Counter for total number of students

    private final int rollNumber;  // Final variable for roll number that cannot be changed
    private String name;
    private String grade;

    // Constructor using 'this' keyword to initialize student details
    public StudentDetails(String name, int rollNumber, String grade) {
        this.rollNumber = rollNumber; // Assign unique roll number
        this.name = name;
        this.grade = grade;
        totalStudents++; // Increment total student count on each new student
    }

    // Static method to display total students enrolled
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to update grade for a student
    public void updateGrade(String newGrade) {
        if (this instanceof StudentDetails) { // Using instanceof to check if it's a valid StudentDetails object
            this.grade = newGrade;
            System.out.println("Grade for " + name + " (Roll Number: " + rollNumber + ") updated to " + newGrade);
        }
    }

    // Method to display student details
    public void displayDetails() {
        if (this instanceof StudentDetails) { // Using instanceof to check if it's a valid StudentDetails object
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("----------------------");
        }
    }

    // Static method to display university name
    public static void displayUniversityName() {
        System.out.println("University: " + universityName);
    }
}

// Main class to execute the program
public class Student {
    public static void main(String[] args) {
        // Creating student objects
        StudentDetails s1 = new StudentDetails("John Doe", 101, "A");
        StudentDetails s2 = new StudentDetails("Jane Smith", 102, "B");

        // Displaying university name and total students
        StudentDetails.displayUniversityName();
        StudentDetails.displayTotalStudents();

        // Displaying student details
        s1.displayDetails();
        s2.displayDetails();

        // Updating grades for students
        s1.updateGrade("A+");
        s2.updateGrade("B+");

        // Displaying student details after grade update
        s1.displayDetails();
        s2.displayDetails();
    }
}

