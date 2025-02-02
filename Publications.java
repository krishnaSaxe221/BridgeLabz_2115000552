// Parent class: Publication
class Publication {
    public String ISBN; // public attribute
    protected String title; // protected attribute
    private String author; // private attribute

    // Constructor
    public Publication(String isbn, String title, String author) {
        this.ISBN = isbn;
        this.title = title;
        this.author = author;
    }

    // Method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author name
    public String getAuthor() {
        return this.author;
    }
}

// Subclass: DigitalBook
 class DigitalBook extends Publication {
    private String fileFormat;

    // Constructor
    public DigitalBook(String isbn, String title, String author, String fileFormat) {
        super(isbn, title, author);
        this.fileFormat = fileFormat;
    }

    // Method to access ISBN, title, and author
    public void displayInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor()); // Accessing private 'author' through getter
    }
}

// Test the implementation
public class Publications {
    public static void main(String[] args) {
        DigitalBook ebook = new DigitalBook("123-456-789", "Java Programming", "Jane Doe", "PDF");
        ebook.displayInfo();
    }
}

