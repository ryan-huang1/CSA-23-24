// Represents a single phone entry with a name and phone number.
class PhoneEntry {
    private String name;   // Name of the person
    private String phone;  // Phone number of the person

    // Constructor for PhoneEntry
    PhoneEntry(String n, String p) {
        name = n;
        phone = p;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the phone number
    public String getPhone() {
        return phone;
    }
}

// PhoneBook class that holds an array of PhoneEntry objects.
public class PhoneBook {
    private PhoneEntry[] phoneBook;

    // Constructor for PhoneBook that initializes the phone book entries.
    PhoneBook() {
        phoneBook = new PhoneEntry[5];

        // Load the phone book with data
        phoneBook[0] = new PhoneEntry("James Barclay", "(418) 665-1223");
        phoneBook[1] = new PhoneEntry("Grace Dunbar", "(860) 399-3044");
        phoneBook[2] = new PhoneEntry("Paul Kratides", "(815) 439-9271");
        phoneBook[3] = new PhoneEntry("Violet Smith", "(312) 223-1937");
        phoneBook[4] = new PhoneEntry("John Wood", "(913) 883-2874");
    }

    // Use linear search to find the targetName in the phone book.
    PhoneEntry search(String targetName) {
        for (int j = 0; j < phoneBook.length; j++) {
            if (phoneBook[j].getName().equals(targetName)) {
                return phoneBook[j];
            }
        }
        return null; // Return null if no matching entry is found.
    }
}

// PhoneBookTester class to test the PhoneBook functionality.
public class PhoneBookTester {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();

        // Search for "Violet Smith" in the phone book
        PhoneEntry entry = pb.search("Violet Smith");

        // If found, print out the entry
        if (entry != null)
            System.out.println(entry.getName() + ": " + entry.getPhone());
        else
            System.out.println("Name not found");
    }
}
