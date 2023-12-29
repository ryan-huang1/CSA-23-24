/**
 * Author [Author's Name]
 * @version 1
 */
public class Book {
    private String title;
    private String author;
    
    /**
     * Default Constructor for objects of class Book.
     */
    public Book() {
        title = null;
        author = null;
    }
    
    /**
     * Normal Constructor for the Book object.
     */
    public Book(String t, String a) {
        title = t;
        author = a;
    }
    
    /**
     * Prints the specs of the Book object.
     * @return String
     */
    public String toString() {
        String str = "The specs of this book are: ";
        str += "\n\tTitle: " + title;
        str += "\n\tAuthor: " + author;
        return str;
    }
    
    // Accessors (getters)
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    // Mutators (setters)
    public void setTitle(String t) {
        title = t;
    }
    
    public void setAuthor(String a) {
        author = a;
    }
}
