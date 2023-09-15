/*
    Header
    Program: hotFudgeSundae
    Author: Ryan Huang
    Date: 9.15.23
    Description: A Java program to simulate the process of making a Hot Fudge Sundae.
*/

public class HotFudgeSundae {
    
    public static void main(String[] args) {
        // Start making the sundae
        getDish();
        String flavor = lookInFreezer();
        getScoop(flavor);
        boolean hasWhippedCream = lookInFridge();
        addHotFudge();
        if (hasWhippedCream) {
            addWhippedCream();
        } else {
            System.out.println("Sorry, we are out of whipped cream.");
        }
        System.out.println("Your Hot Fudge Sundae is ready!");
    }

    // Get the dish for the sundae
    public static void getDish() {
        System.out.println("Getting a dish for the sundae...");
    }

    // Look in the freezer for ice cream and choose a flavor
    public static String lookInFreezer() {
        System.out.println("Looking in the freezer...");
        // Let's assume vanilla is available for this example
        String flavor = "vanilla";
        System.out.println("Choosing " + flavor + " ice cream.");
        return flavor;
    }

    // Scoop the chosen ice cream flavor into the dish
    public static void getScoop(String flavor) {
        System.out.println("Scooping " + flavor + " ice cream into the dish...");
    }

    // Look in the fridge to see if whipped cream is available
    public static boolean lookInFridge() {
        System.out.println("Looking in the fridge for whipped cream...");
        // Let's assume whipped cream is available for this example
        boolean hasWhippedCream = true;
        return hasWhippedCream;
    }

    // Add hot fudge to the sundae
    public static void addHotFudge() {
        System.out.println("Adding hot fudge...");
    }

    // Add whipped cream to the sundae
    public static void addWhippedCream() {
        System.out.println("Adding whipped cream...");
    }

    /*
        Footer
        The program has successfully simulated making a Hot Fudge Sundae.
    */
}
