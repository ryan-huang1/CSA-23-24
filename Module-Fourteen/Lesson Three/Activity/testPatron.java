import java.util.Calendar;

/**
 * Write a description of class testPatron here.
 *
 * @author Ryan
 */
public class testPatron {
    public static void main(String[] args) {
        Patron Emily = new Patron();
        Media myBook = new Book();
        Media myMovie = new Movie();

        myBook.setTitle("ABC");
        ((Book) myBook).setAuthor("Suzie Smith");
        myMovie.setTitle("Garden State");
        ((Movie) myMovie).setYear(2008);

        System.out.print(myBook);
        System.out.print(myMovie);
    }
}
