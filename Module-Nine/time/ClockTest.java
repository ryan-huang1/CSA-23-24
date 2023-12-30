package time;

public class ClockTest {
    public static void main(String[] args) {
        // Create an instance of a Clock object
        Clock clock = new Clock();

        // Print the Clock using its toString() method
        System.out.println(clock);

        // Use the "setTime()" method to set the Clock's time to a non-zero time
        clock.setTime(3, 45, 16);

        // Print the Clock again using its toString() method
        System.out.println(clock);

        // Use the "convertDaylightSaving(int num)" method to adjust the time of the Clock by the hours parameter
        clock.convertDaylightSaving(1); // Springing forward

        // Print the Clock again using its toString() method
        System.out.println(clock);
    }
}
