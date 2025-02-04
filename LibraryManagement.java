class LibraryManagementDetails{
    private static String libraryName = "Central Library";
    private String title;
    private String author;
    private static double isbn;


    public LibraryManagementDetails(String title, String author, double isbn){
        this.title = title;
        this.author = author;
        this.isbn  = isbn;
    }
    public void displayLibraryName(){
        System.out.println("The Library name is : " + libraryName);
    }

    //Method
}
public class LibraryManagement {
    public static void main(String[] args) {
        LibraryManagementDetails l1 = new LibraryManagementDetails("Departmental Library", "Robort Frost", 2115000552);
        l1.displayLibraryName();

    }
}
