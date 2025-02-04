// ProductDetails class to manage product information
class ProductDetails {
    private static double discount = 10.0; // Static discount shared by all products
    private static int productCount = 0;   // Counter for generating unique product IDs

    private final int productID;  // Final variable for unique product ID
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' keyword
    public ProductDetails(String productName, double price, int quantity) {
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
        if (this instanceof ProductDetails) { // Using instanceof
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
public class Product {
    public static void main(String[] args) {
        ProductDetails p1 = new ProductDetails("Laptop", 800, 1);
        ProductDetails p2 = new ProductDetails("Phone", 500, 2);

        p1.displayDetails();
        p2.displayDetails();

        // Updating discount
        ProductDetails.updateDiscount(15.0);
        System.out.println("Updated Discount: 15%\n");

        p1.displayDetails();
        p2.displayDetails();
    }
}
