import java.util.Scanner;

class PhoneEntry {
    private String firstName = ""; // Initialize with empty string for cases with no first name
    private String lastName;
    private String phone;

    // Modified constructor to handle both full name and just last name
    PhoneEntry(String name, String phone) {
        String[] parts = name.split(" ", 2); // Split the name into parts
        if (parts.length > 1) {
            this.firstName = parts[0];
            this.lastName = parts[1];
        } else {
            this.lastName = parts[0];
        }
        this.phone = phone;
    }

    public String getFullName() {
        return firstName.isEmpty() ? lastName : firstName + " " + lastName;
    }

    public String getPhone() {
        return phone;
    }
}


class PhoneBook {
    private PhoneEntry[] phoneBook;
    private int maxEntries = 10; // Increased to provide space for adding new entries

    PhoneBook() {
        phoneBook = new PhoneEntry[maxEntries]; // Adjust the size for null handling

        // Initial entries
        phoneBook[0] = new PhoneEntry("James", "Barclay", "(418) 665-1223");
        phoneBook[1] = new PhoneEntry("Grace", "Dunbar", "(860) 399-3044");
        phoneBook[2] = new PhoneEntry("Paul", "Kratides", "(815) 439-9271");
        phoneBook[3] = new PhoneEntry("Violet", "Smith", "(312) 223-1937");
        phoneBook[4] = new PhoneEntry("John", "Wood", "(913) 883-2874");
    }

    void search(String lastName, String firstName) {
        for (int i = 0; i < phoneBook.length; i++) {
            PhoneEntry entry = phoneBook[i];
            if (entry != null && entry.getLastName().equalsIgnoreCase(lastName)) {
                if (firstName.isEmpty() || entry.getFirstName().equalsIgnoreCase(firstName)) {
                    System.out.println(entry.getFirstName() + " " + entry.getLastName() + ": " + entry.getPhone());
                    return; // Stop after the first match if first name is provided
                }
            }
        }
        System.out.println("Name not found.");
    }

    void addEntry(String firstName, String lastName, String phone) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] == null) {
                phoneBook[i] = new PhoneEntry(firstName, lastName, phone);
                System.out.println("Entry added.");
                return;
            }
        }
        System.out.println("Error: Phone book is full.");
    }

    void deleteEntry(String firstName, String lastName) {
        for (int i = 0; i < phoneBook.length; i++) {
            PhoneEntry entry = phoneBook[i];
            if (entry != null && entry.getFirstName().equalsIgnoreCase(firstName) && entry.getLastName().equalsIgnoreCase(lastName)) {
                for (int j = i; j < phoneBook.length - 1; j++) {
                    phoneBook[j] = phoneBook[j + 1]; // Shift entries to keep nulls at the end
                }
                phoneBook[phoneBook.length - 1] = null; // Set the last entry to null
                System.out.println("Entry deleted.");
                return;
            }
        }
        System.out.println("Error: Name not found.");
    }
}

public class PhoneBookTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook pb = new PhoneBook();

        while (true) {
            System.out.println("Choose an action: (1) Search (2) Add (3) Delete (4) Quit");
            String action = scanner.nextLine();

            switch (action) {
                case "1":
                    System.out.print("Last Name? ");
                    String lastName = scanner.nextLine();
                    System.out.print("First Name? ");
                    String firstName = scanner.nextLine();
                    pb.search(lastName, firstName);
                    break;
                case "2":
                    System.out.print("Enter First Name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String newLastName = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String newPhone = scanner.nextLine();
                    pb.addEntry(newFirstName, newLastName, newPhone);
                    break;
                case "3":
                    System.out.print("Enter First Name to Delete: ");
                    String delFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name to Delete: ");
                    String delLastName = scanner.nextLine();
                    pb.deleteEntry(delFirstName, delLastName);
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid action. Please choose between 1 and 4.");
                    break;
            }
        }
    }
}
