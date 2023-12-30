package time;

public class Clock {
    // Instance variables for the Clock's hours, minutes, and seconds
    private int hours;
    private int minutes;
    private int seconds;

    // Zero-argument (default) constructor
    public Clock() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Three-argument constructor to initialize all instance variables
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Setter method for time
    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to convert daylight saving time
    public void convertDaylightSaving(int num) {
        this.hours += num;
    }

    // Method to calculate total seconds
    public int totalSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    // toString method to display time in the specified format
    @Override
    public String toString() {
        return "The time is " + this.hours + ":" + this.minutes + ":" + this.seconds +
               "\nThe total number of seconds is: " + this.totalSeconds();
    }
}