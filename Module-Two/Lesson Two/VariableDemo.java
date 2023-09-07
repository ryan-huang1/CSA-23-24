/**
 * This is the main class for demonstrating variables and computations.
 */
public class VariableDemo {
  
    /**
     * This is the main method which is the entry point for the program.
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Declare and assign value to a variable for storing name
        String myName = "Ryan";
        
        // Declare and assign value to a variable for storing current age
        int myCurrentAge = 2; 
        
        // Declare a variable to store age 5 years from now
        int myFutureAge;
        
        // Compute the value for age 5 years from now using current age
        myFutureAge = myCurrentAge + 5;
        
        // Display the values of all three variables on separate lines
        System.out.println("My name is: " + myName);
        System.out.println("My current age is: " + myCurrentAge);
        System.out.println("My age 5 years from now will be: " + myFutureAge);
    }
}
