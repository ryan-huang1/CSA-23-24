import java.util.Calendar;

public class Book {
    // Instance variables
    private String author;
    private String title;
    private Calendar today;

    // Default constructor for objects of class Book
    public Book() {
        // Initialize instance variables
        author = null;
        title = null;
        today = Calendar.getInstance();
    }

    // Normal constructor for the Book object
    public Book(String t, String a, Calendar c) {
        // Initialize instance variables
        title = t;
        author = a;
        today = c;
    }

    // Copy constructor that copies the book
    public Book(Book b) {
        author = b.author;
        title = b.title;
        today = b.today;
    }

    // Accessor methods (getters)
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    // Mutator methods (setters)
    public void setAuthor(String a) {
        author = a;
    }

    public void setTitle(String t) {
        title = t;
    }

    // Other methods
    // Prints the specs of the Book object
    public String toString() {
        String str = "The specs of this book are: ";
        str += "\n\tTitle: " + title;
        str += "\n\tAuthor: " + author;
        str += "\n\tCheckout date: " + today;
        return str;
    }

    // Calculates the return date based on the checkout date
    public Calendar getReturnDate() {
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(Calendar.MONTH, today.get(Calendar.MONTH));
        dueDate.set(Calendar.YEAR, today.get(Calendar.YEAR));
        dueDate.set(Calendar.DATE, today.get(Calendar.DATE) + 21); // Assuming a fixed 21-day loan period

        return dueDate;
    }
}
