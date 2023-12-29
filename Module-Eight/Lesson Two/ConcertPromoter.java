import java.util.Scanner;

public class ConcertPromoter {

    private int venueCapacity;
    private double phoneTicketPrice;
    private double venueTicketPrice;
    private int ticketsToSell;
    private int phoneSales;
    private int venueSales;

    public ConcertPromoter(int capacity, double phonePrice, double venuePrice, int toSell) {
        venueCapacity = capacity;
        phoneTicketPrice = phonePrice;
        venueTicketPrice = venuePrice;
        ticketsToSell = toSell;
    }

    // Method to record sales over the phone
    public void recordPhoneSales(int numberSold) {
        if (numberSold <= ticketsToSell) {
            phoneSales += numberSold;
            ticketsToSell -= numberSold;
        } else {
            System.out.println("Not enough tickets to sell.");
        }
    }

    // Method to record sales at the venue
    public void recordVenueSales(int numberSold) {
        if (numberSold <= ticketsToSell) {
            venueSales += numberSold;
            ticketsToSell -= numberSold;
        } else {
            System.out.println("Not enough tickets to sell.");
        }
    }

    // Method to calculate the total sales
    public double calculateTotalSales() {
        return (phoneSales * phoneTicketPrice) + (venueSales * venueTicketPrice);
    }

    // Method to calculate the remaining tickets
    public int ticketsRemaining() {
        return ticketsToSell;
    }

    // Method to print a sales summary
    public void printSalesSummary() {
        double percentCapacityUsed = ((double) (phoneSales + venueSales) / venueCapacity) * 100;
        double phoneSalesTotal = phoneSales * phoneTicketPrice;
        double venueSalesTotal = venueSales * venueTicketPrice;
        double totalSales = calculateTotalSales();
        double lostRevenue = (venueCapacity - (phoneSales + venueSales)) * Math.min(phoneTicketPrice, venueTicketPrice);

        System.out.println("Percent capacity usage is " + percentCapacityUsed + "%");
        System.out.println("Phone sales: $" + phoneSalesTotal);
        System.out.println("Venue sales: $" + venueSalesTotal);
        System.out.println("Total sales: $" + totalSales);
        System.out.println("Lost revenue based on lowest price ticket: $" + lostRevenue);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user input for concert details
        System.out.print("What is the capacity of the venue: ");
        int capacity = scanner.nextInt();
        System.out.print("What is the price per ticket sold by phone: $");
        double phonePrice = scanner.nextDouble();
        System.out.print("What is the number of phone sales: ");
        int phoneSales = scanner.nextInt();
        System.out.print("What is the price per ticket sold at venue: $");
        double venuePrice = scanner.nextDouble();
        System.out.print("What is the number of venue sales: ");
        int venueSales = scanner.nextInt();
        System.out.print("What is the number of tickets to sell: ");
        int toSell = scanner.nextInt();

        // Initialize the concert promoter object with provided details
        ConcertPromoter promoter = new ConcertPromoter(capacity, phonePrice, venuePrice, toSell);

        // Record sales
        promoter.recordPhoneSales(phoneSales);
        promoter.recordVenueSales(venueSales);

        // Print sales summary
        promoter.printSalesSummary();

        scanner.close();
    }
}
