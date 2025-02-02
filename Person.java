import java.util.Scanner;

class PublicDetails{
    String name;
    double salary;

    public PublicDetails(String name, double salary){
        this.salary = salary;
        this.name = name;
    }

    //creating another method which clones the attributes
    public PublicDetails (PublicDetails anotherPerson){
        this.name = anotherPerson.name;
        this.salary = anotherPerson.salary;
    }
    public void displayDetails(){
        System.out.println("Name is : "+ name);
        System.out.println("Salary is : " + salary);

    }
}


public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = sc.nextDouble();

        System.out.println("Enter the name");
        String name = sc.next();

        //creating the object
        PublicDetails p1 = new PublicDetails(name, salary);

        //cloning into new person
        PublicDetails p2 = new PublicDetails(p1);

        //displaying
        System.out.println("\n Person1 details");
        p1.displayDetails();

        System.out.println("\n Person 2 details");
        p2.displayDetails();






    }
}
