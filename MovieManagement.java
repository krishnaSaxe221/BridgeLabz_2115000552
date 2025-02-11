class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next, prev;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = this.prev = null;
    }
}

class MovieList {
    private Movie head, tail;

    // Add movie at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add movie at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Remove movie by title
    public void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    // Search movie by Director
    public void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println(temp.title + " - " + temp.year + " - " + temp.rating);
            }
            temp = temp.next;
        }
    }

    // Search movie by Rating
    public void searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.title + " - " + temp.director + " - " + temp.year);
            }
            temp = temp.next;
        }
    }

    // Update movie rating
    public void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Display movies forward
    public void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director + " - " + temp.year + " - " + temp.rating);
            temp = temp.next;
        }
    }

    // Display movies in reverse
    public void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director + " - " + temp.year + " - " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManagement {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        list.addAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        list.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.displayForward();

        System.out.println("\nUpdating rating...");
        list.updateRating("Inception", 9.0);
        list.displayForward();

        System.out.println("\nRemoving movie...");
        list.removeByTitle("The Dark Knight");
        list.displayForward();

        System.out.println("\nDisplaying in reverse order...");
        list.displayReverse();
    }
}

