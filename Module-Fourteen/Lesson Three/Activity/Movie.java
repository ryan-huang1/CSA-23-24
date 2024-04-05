import java.util.Calendar;

public class Movie extends Media {
    private int year;

    // Default constructor
    public Movie() {
        super(null, null); // Assuming the Media class has a constructor accepting title and checkout date
        year = 0;
    }

    // Constructor with title, year, and checkout date
    public Movie(String t, int y, Calendar c) {
        super(t, c); // Assuming the Media class has a constructor accepting title and checkout date
        year = y;
    }

    // Copy constructor
    public Movie(Movie m) {
        super(m.getTitle(), m.getCheckoutDate()); // Assuming Media class has getTitle() and getCheckoutDate() methods
        this.year = m.getYear();
    }

    // Accessor for year
    public int getYear() {
        return year;
    }

    // Mutator for year
    public void setYear(int y) {
        this.year = y;
    }

    // Calculates the return date of the item, assuming a 7-day loan period
    public Calendar getReturnDate() {
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(Calendar.MONTH, this.getCheckoutDate().get(Calendar.MONTH));
        dueDate.set(Calendar.YEAR, this.getCheckoutDate().get(Calendar.YEAR));
        dueDate.add(Calendar.DATE, 7); // Add 7 days to the checkout date
        return dueDate;
    }

    // Prints the specs of the Movie object
    public String toString() {
        String str = "\nThe specs of this movie are: ";
        str += "\n\tTitle: " + this.getTitle(); // Assuming Media class has a getTitle() method
        str += "\n\tYear: " + this.year;
        str += "\n\tCheckout date: " + this.getCheckoutDate().getTime(); // Converts Calendar to Date and prints it
        str += "\n\tReturn date: " + this.getReturnDate().getTime(); // Converts Calendar to Date and prints it
        return str;
    }
}
