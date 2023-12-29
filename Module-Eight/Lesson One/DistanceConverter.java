import java.util.Scanner;

public class DistanceConverter {
    
    // Conversion factors
    private static final double KILOMETERS_IN_A_MILE = 1.60934;
    private static final double MILES_IN_A_KILOMETER = 0.621371;
    private static final int YARDS_IN_A_MILE = 1760;
    
    // Method to convert miles to kilometers
    public static double milesToKM(double miles) {
        return miles * KILOMETERS_IN_A_MILE;
    }
    
    // Method to convert kilometers to miles
    public static double kmToMiles(double kilometers) {
        return kilometers * MILES_IN_A_KILOMETER;
    }
    
    // Method to convert miles to yards
    public static double milesToYards(double miles) {
        return miles * YARDS_IN_A_MILE;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose 1 for miles, 2 for km, 3 for yards: ");
        int choice = scanner.nextInt();
        
        double distance, convertedDistance;
        
        switch (choice) {
            case 1: // Miles
                System.out.println("Enter your mileage: ");
                distance = scanner.nextDouble();
                System.out.println("You entered " + distance + " miles.");
                System.out.println("This is " + milesToKM(distance) + " km.");
                System.out.println("This is " + milesToYards(distance) + " yards.");
                break;
            case 2: // Kilometers
                System.out.println("Enter the kilometers: ");
                distance = scanner.nextDouble();
                System.out.println("You entered " + distance + " km.");
                convertedDistance = kmToMiles(distance);
                System.out.println("This is " + convertedDistance + " miles.");
                System.out.println("This is " + milesToYards(convertedDistance) + " yards.");
                break;
            case 3: // Yards
                System.out.println("Enter the yards: ");
                distance = scanner.nextDouble();
                convertedDistance = distance / YARDS_IN_A_MILE;
                System.out.println("You entered " + distance + " yards.");
                System.out.println("This is " + convertedDistance + " miles.");
                System.out.println("This is " + milesToKM(convertedDistance) + " km.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
        scanner.close();
    }
}
