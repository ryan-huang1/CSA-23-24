package library;

/**
 * Author Ryan
 * @version 1
 */
public class Book
{
    private String title;
    private String author;

    // Default constructor
    public Book()
    {
        this.title = null;
        this.author = null;
    }

    // Parameterized constructor
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    // Copy constructor
    public Book(Book otherBook)
    {
        this.title = otherBook.title;
        this.author = otherBook.author;
    }

    // toString method to print book details
    public String toString()
    {
        return "The specs of this book are: " +
               "\n\tTitle: " + this.title +
               "\n\tAuthor: " + this.author;
    }

    // Accessor for title
    public String getTitle()
    {
        return this.title;
    }

    // Accessor for author
    public String getAuthor()
    {
        return this.author;
    }

    // Mutator for title
    public void setTitle(String title)
    {
        this.title = title;
    }

    // Mutator for author
    public void setAuthor(String author)
    {
        this.author = author;
    }
}
