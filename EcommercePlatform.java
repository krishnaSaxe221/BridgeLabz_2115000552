import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("  - " + name + " ($" + price + ")");
    }
}

// Order Class (Aggregates Products)
class Order {
    int orderId;
    List<Product> products;
    Customer1 Customer1;

    public Order(int orderId, Customer1 Customer1) {
        this.orderId = orderId;
        this.Customer1 = Customer1;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("\n🛒 Order ID: " + orderId + " | Customer1: " + Customer1.name);
        for (Product p : products) {
            p.displayProduct();
        }
    }
}

// Customer1 Class (Associates with Orders)
class Customer1 {
    String name;
    List<Order> orders;

    public Customer1(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        System.out.println("\n📌 Customer1: " + name + " Orders:");
        for (Order o : orders) {
            o.displayOrder();
        }
    }
}

// Driver Class
public class EcommercePlatform {
    public static void main(String[] args) {
        // Create Customer1s
        Customer1 alice = new Customer1("Alice");
        Customer1 bob = new Customer1("Bob");

        // Create Products
        Product phone = new Product("Smartphone", 699.99);
        Product laptop = new Product("Laptop", 1199.99);
        Product headset = new Product("Wireless Headset", 199.99);

        // Create Orders
        Order order1 = new Order(101, alice);
        order1.addProduct(phone);
        order1.addProduct(headset);

        Order order2 = new Order(102, bob);
        order2.addProduct(laptop);

        // Customer1s place orders
        alice.placeOrder(order1);
        bob.placeOrder(order2);

        // Display Orders
        alice.displayOrders();
        bob.displayOrders();
    }
}

