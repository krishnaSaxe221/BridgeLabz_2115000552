import java.util.ArrayList;
import java.util.List;

// Course Class (Independent, Many-to-Many with Students)
class Course {
    String courseName;
    List<Student> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Enroll a Student
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.enrollCourse(this);  // Ensures bidirectional relationship
        }
    }

    // Display Enrolled Students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName + " | Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("  - " + s.name);
        }
    }
}

// Student Class (Independent, Many-to-Many with Courses)
class Student {
    String name;
    List<Course> courses;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Enroll in a Course
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this);  // Ensures bidirectional relationship
        }
    }

    // View Enrolled Courses
    public void viewCourses() {
        System.out.println("Student: " + name + " | Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("  - " + c.courseName);
        }
    }
}

// School Class (Aggregation with Students)
class School {
    String schoolName;
    List<Student> students;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add a Student to the School
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display Students in School
    public void displayStudents() {
        System.out.println("School: " + schoolName + " | Students:");
        for (Student s : students) {
            System.out.println("  - " + s.name);
        }
    }
}

// Driver Class
public class SchoolAssociationExample {
    public static void main(String[] args) {
        // Create School
        School school = new School("Greenwood High");

        // Create Students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add Students to School (Aggregation)
        school.addStudent(alice);
        school.addStudent(bob);

        // Create Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("History");

        // Enroll Students in Courses (Association)
        alice.enrollCourse(math);
        alice.enrollCourse(science);
        bob.enrollCourse(math);
        bob.enrollCourse(history);

        // Display School Students
        school.displayStudents();

        // Display Student Courses
        alice.viewCourses();
        bob.viewCourses();

        // Display Course Enrollments
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
        history.displayEnrolledStudents();
    }
}

