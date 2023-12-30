package library;

public class testBook {
    public static void main(String[] args) {
        // Creating book objects with given titles and authors
        Book myBook1 = new Book("Alice in Wonderland", "Lewis Carroll");
        Book myBook2 = new Book();
        Book myBook3 = new Book("On the Highway", "Jen Jones");

        // Printing out the details of the books
        System.out.println(myBook1);
        System.out.println(myBook2);
        System.out.println(myBook3);

        // Using setter methods to set the title and author for myBook2
        myBook2.setTitle("Alphabet 123");
        myBook2.setAuthor("Sam Smith");

        // Printing out the updated details of myBook2
        System.out.println(myBook2);
        
        // Using setter method to change the author of myBook3
        myBook3.setAuthor("Jennifer Jones");

        // Printing out the updated details of myBook3
        System.out.println(myBook3);
    }
}
