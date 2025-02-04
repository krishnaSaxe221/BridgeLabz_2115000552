// ShoppingCartDetails class to manage shopping cart items
class ShoppingCartDetails {
    private static double discount = 10.0; // Static variable shared by all products
    private static int productCount = 0;   // Counter for generating unique product IDs

    private final int productID;  // Final variable for unique product ID
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' keyword to initialize product details
    public ShoppingCartDetails(String productName, double price, int quantity) {
        this.productID = ++productCount; // Auto-increment unique product ID
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to calculate final price after discount
    public double getFinalPrice() {
        return price * quantity * (1 - discount / 100);
    }

    // Method to display product details
    public void displayDetails() {
        if (this instanceof ShoppingCartDetails) { // Using instanceof to validate object type
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Final Price (after " + discount + "% discount): $" + getFinalPrice());
            System.out.println("----------------------");
        }
    }
}

// Main class to execute the program
public class ShoppingCart {
    public static void main(String[] args) {
        // Creating product objects
        ShoppingCartDetails p1 = new ShoppingCartDetails("Laptop", 800, 1);
        ShoppingCartDetails p2 = new ShoppingCartDetails("Phone", 500, 2);

        // Displaying product details before discount update
        p1.displayDetails();
        p2.displayDetails();

        // Updating discount
        ShoppingCartDetails.updateDiscount(15.0);
        System.out.println("Updated Discount: 15%\n");

        // Displaying product details after discount update
        p1.displayDetails();
        p2.displayDetails();
    }
}

