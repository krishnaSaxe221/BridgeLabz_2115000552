import java.util.ArrayList;
import java.util.List;

// Book class (Can exist independently)
class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class (Aggregates Books)
class Library {
    String name;
    List<Book> books;  // Aggregation: Library "has-a" list of Books

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    void displayLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
    }
}

// Driver class
public class LibraryAggregationExample {
    public static void main(String[] args) {
        // Creating books (Books can exist independently)
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Creating Libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        // Adding books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        // Displaying books in each library
        lib1.displayLibraryBooks();
        System.out.println();
        lib2.displayLibraryBooks();
    }
}

