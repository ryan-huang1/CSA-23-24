public class Tester {
    public static void main(String args[]) {
        // First part of the code from the first image
        String m = "Hello";
        String n = "good buddy";
        String c = m + " " + n;
        System.out.println("The length of the string c is: " + c.length());

        // Adding an extra line for clear separation in output
        System.out.println();

        // Second part of the code from the second image
        String myPet = "Sparky the dog";
        String smallPart = myPet.substring(4, 12);
        System.out.println("The substring of myPet is: " + smallPart);
    }
}
