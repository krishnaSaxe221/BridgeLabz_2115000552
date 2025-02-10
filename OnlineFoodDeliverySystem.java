import java.util.*;

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

// Interface for Discountable
interface Discountable {
    double applyDiscount(double discountRate);
    String getDiscountDetails();
}

// VegItem subclass
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double discountRate) {
        return calculateTotalPrice() * (1 - discountRate);
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: Applied based on rate.";
    }
}

// NonVegItem subclass
class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_SURCHARGE = 1.1; // 10% extra charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * NON_VEG_SURCHARGE;
    }

    @Override
    public double applyDiscount(double discountRate) {
        return calculateTotalPrice() * (1 - discountRate);
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: Applied based on rate.";
    }
}

// Main class to process orders
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem item1 = new VegItem("Paneer Butter Masala", 200, 2);
        NonVegItem item2 = new NonVegItem("Chicken Biryani", 300, 1);

        order.add(item1);
        order.add(item2);

        double discountRate = 0.1; // 10% discount

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                System.out.println(((Discountable) item).getDiscountDetails());
                System.out.println("Price after Discount: " + ((Discountable) item).applyDiscount(discountRate));
            }

            System.out.println("----------------");
        }
    }
}

