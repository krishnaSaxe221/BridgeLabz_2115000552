class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " weeks, Fee: $" + fee + ", Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Creating Course Objects
        Course course1 = new Course("Java Programming", 10, 299.99);
        Course course2 = new Course("Python Basics", 8, 199.99);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Updating Institute Name
        Course.updateInstituteName("Tech Academy");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}

