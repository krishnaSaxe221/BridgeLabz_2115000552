class BookDetails{
    String title;
    String author;
    double price;

    //default constructors
    public BookDetails(){
        this.author = "I dont't know";
        this.price = 0;
        this.title = "Anonymous";

    }

    //parameterized constructor
    public BookDetails(String author, String title, double price){
        this.price = price;
        this.author = author;
        this.title = title;

    }
    public void displayDetails(){
        System.out.println("The title is : " + title);
        System.out.println("The author is : " + author);
        System.out.println("The price is : " + price);


    }
}
public class Book {
    public static void main(String[] args) {
        //default
        BookDetails b2 = new BookDetails();
        b2.displayDetails();
        //parameterized
        BookDetails b1 = new BookDetails("Unknown author" , "Dont know", 500);
       b1.displayDetails();
    }
}
