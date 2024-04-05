import java.util.Calendar;

/**
 * Write a description of class Media here.
 *
 * @author isloss
 * @version (a version number or a date)
 */

public abstract class Media {
    // instance variables
    private String title;
    private Calendar checkOut;

    // This is the default to set up the super for the child class
    public Media() {
        title = null;
        checkOut = Calendar.getInstance();
    }

    /**
     * Normal constructor
     */
    public Media(String t, Calendar c) {
        title = t;
        checkOut = c;
    }

    public abstract Calendar getReturnDate();
}
