import java.util.*;

// Abstract LibraryItem class
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

// Interface for Reservable
interface Reservable {
    boolean reserveItem();
    boolean checkAvailability();
}

// Book subclass
class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan period for books
    }

    @Override
    public boolean reserveItem() {
        if (!isReserved) {
            isReserved = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Magazine subclass
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days loan period for magazines
    }
}

// DVD subclass
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 5; // 5 days loan period for DVDs
    }

    @Override
    public boolean reserveItem() {
        if (!isReserved) {
            isReserved = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Main class to demonstrate polymorphism
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        Book item1 = new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald");
        Magazine item2 = new Magazine("M202", "National Geographic", "Various");
        DVD item3 = new DVD("D303", "Inception", "Christopher Nolan");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                System.out.println("Available for reservation: " + ((Reservable) item).checkAvailability());
            }
            System.out.println("----------------");
        }
    }
}

