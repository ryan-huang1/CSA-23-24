import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        do {
            System.out.print("What string would you like to enter: ");
            input = scanner.nextLine();
            
            System.out.println("You entered " + input);
            
            // Reverse the string
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("The string reversed is " + reversed);
            
            // Convert to uppercase
            String upperReversed = reversed.toUpperCase();
            System.out.println("The reversed string in capital letters is " + upperReversed);
            
            // Ask the user if they want to enter another string
            System.out.print("Would you like to enter another string (Y/N)? ");
            input = scanner.nextLine();
            
        } while (input.equalsIgnoreCase("Y"));
        
        scanner.close();
    }
}
