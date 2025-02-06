import java.util.ArrayList;
import java.util.List;

// Coursee Class (Aggregates Studentts & Associates with Professors)
class Coursee {
    String name;
    Professor professor;
    List<Studentt> Studentts;

    public Coursee(String name) {
        this.name = name;
        this.Studentts = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCoursee(this);
    }

    public void enrollStudentt(Studentt Studentt) {
        Studentts.add(Studentt);
        Studentt.addCoursee(this);
    }

    public void displayCoursee() {
        System.out.println("\n📚 Coursee: " + name);
        System.out.println("  Professor: " + (professor != null ? professor.name : "TBD"));
        System.out.println("  Studentts Enrolled:");
        for (Studentt s : Studentts) {
            System.out.println("   - " + s.name);
        }
    }
}

// Studentt Class (Associates with Coursees)
class Studentt {
    String name;
    List<Coursee> Coursees;

    public Studentt(String name) {
        this.name = name;
        this.Coursees = new ArrayList<>();
    }

    public void addCoursee(Coursee Coursee) {
        Coursees.add(Coursee);
    }

    public void displayCoursees() {
        System.out.println("\n🎓 Studentt: " + name + " Enrolled Coursees:");
        for (Coursee c : Coursees) {
            System.out.println("  - " + c.name);
        }
    }
}

// Professor Class (Associates with Coursees)
class Professor {
    String name;
    List<Coursee> Coursees;

    public Professor(String name) {
        this.name = name;
        this.Coursees = new ArrayList<>();
    }

    public void addCoursee(Coursee Coursee) {
        Coursees.add(Coursee);
    }

    public void displayCoursees() {
        System.out.println("\n👨‍🏫 Professor: " + name + " Teaching Coursees:");
        for (Coursee c : Coursees) {
            System.out.println("  - " + c.name);
        }
    }
}

// Driver Class
public class UniversityManagement {
    public static void main(String[] args) {
        // Create Professors
        Professor profJohn = new Professor("Prof. John");
        Professor profEmma = new Professor("Prof. Emma");

        // Create Coursees
        Coursee math = new Coursee("Mathematics");
        Coursee physics = new Coursee("Physics");

        // Assign Professors to Coursees
        math.assignProfessor(profJohn);
        physics.assignProfessor(profEmma);

        // Create Studentts
        Studentt alice = new Studentt("Alice");
        Studentt bob = new Studentt("Bob");

        // Enroll Studentts in Coursees
        math.enrollStudentt(alice);
        math.enrollStudentt(bob);
        physics.enrollStudentt(alice);

        // Display Information
        math.displayCoursee();
        physics.displayCoursee();
        alice.displayCoursees();
        bob.displayCoursees();
        profJohn.displayCoursees();
        profEmma.displayCoursees();
    }
}
