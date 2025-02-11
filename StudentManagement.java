class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;

    public Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    private Student head;

    // Add a student at the beginning
    public void addAtBeginning(int roll, String name, int age, String grade) {
        Student newStudent = new Student(roll, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    // Add a student at the end
    public void addAtEnd(int roll, String name, int age, String grade) {
        Student newStudent = new Student(roll, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    // Add a student at a specific position
    public void addAtPosition(int roll, String name, int age, String grade, int position) {
        Student newStudent = new Student(roll, name, age, grade);
        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    // Delete a student by Roll Number
    public void deleteByRollNumber(int roll) {
        if (head == null) return;
        if (head.rollNumber == roll) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student not found");
            return;
        }
        temp.next = temp.next.next;
    }

    // Search for a student by Roll Number
    public Student searchByRollNumber(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Update student's grade by Roll Number
    public void updateGrade(int roll, String newGrade) {
        Student temp = searchByRollNumber(roll);
        if (temp != null) {
            temp.grade = newGrade;
        } else {
            System.out.println("Student not found");
        }
    }

    // Display all student records
    public void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll No: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addAtEnd(101, "Alice", 20, "A");
        list.addAtEnd(102, "Bob", 21, "B");
        list.addAtBeginning(100, "Charlie", 19, "A");
        list.addAtPosition(103, "David", 22, "C", 2);
        list.displayAll();

        System.out.println("\nUpdating grade...");
        list.updateGrade(102, "A+");
        list.displayAll();

        System.out.println("\nDeleting student with Roll No 101...");
        list.deleteByRollNumber(101);
        list.displayAll();
    }
}

