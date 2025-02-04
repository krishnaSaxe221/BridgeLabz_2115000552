class EmployeeDetails{
    private static String companyName = "InfoTech";
    private static int totalEmployee = 0;

    private String name;
    private final double id;
    private String designation;

    public EmployeeDetails(String name, double id, String designation){
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployee++;
    }

    //static method for displaying total emp
    public static void displayTotalEmployee(){
        System.out.println("Total Employee: " + totalEmployee);
    }

    //method to display total employees
    public void displayDetails(){
        if(this instanceof EmployeeDetails){
        System.out.println("The name is : " + name);
        System.out.println("The designation is : " + designation);
        System.out.println("The companyName is : " + companyName );
            System.out.println("The id is " + id);
        }}

}
public class Employee {
    public static void main(String[] args) {
        EmployeeDetails e1 = new EmployeeDetails("krishna", 2115000552, "Trainee");
                e1.displayDetails();

        EmployeeDetails.displayTotalEmployee();

    }
}
