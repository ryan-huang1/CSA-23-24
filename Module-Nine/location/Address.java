package location;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.setState(state); // Using setter for error checking
        this.setZip(zip);     // Using setter for error checking
    }

    // Getters and Setters with error checking
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state.length() == 2) {
            this.state = state;
        } else {
            throw new IllegalArgumentException("State must be 2 characters.");
        }
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        if (zip.matches("\\d{5}")) {
            this.zip = zip;
        } else {
            throw new IllegalArgumentException("Zip must be a 5 digit number.");
        }
    }

    // Method to print the address in the required format
    public void printAddress() {
        System.out.println(street);
        System.out.println(city + ", " + state + " " + zip);
        System.out.println(); // Blank line
        System.out.println(street);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zip);
    }
}
