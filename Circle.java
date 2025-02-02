import java.util.Scanner;

class CircleRadius{
    double radius;

    //default constructor
     public CircleRadius(){
         this(1.2);
     }
     //parameterized
     public CircleRadius(double radius){
         this.radius = radius;
     }

     public void displayDetail(){
         System.out.println("Area of circle: " + Math.PI*Math.pow(radius, 2));
     }
}
public class Circle {
    public static void main(String[] args) {
        //default
        CircleRadius c1 = new CircleRadius();
        c1.displayDetail();

        //with user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();
        CircleRadius c2 = new CircleRadius();
        System.out.println("\n Area of circle of user input");
        c2.displayDetail();

    }
}
