package work;

public class Employee {
    private int employeeId;
    private String job;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String job, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.job = job;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateRegularPay() {
        if (hoursWorked <= 40) {
            return payRate * hoursWorked;
        } else {
            return payRate * 40;
        }
    }

    public double calculateOvertimePayUnder50() {
        if (hoursWorked > 40 && hoursWorked <= 50) {
            return (payRate * 1.5) * (hoursWorked - 40);
        } else if (hoursWorked > 40) {
            return (payRate * 1.5) * 10; // The pay for the interval between 40 to 50 hours
        } else {
            return 0;
        }
    }

    public double calculateOvertimePayOver50() {
        if (hoursWorked > 50) {
            return (payRate * 2) * (hoursWorked - 50);
        } else {
            return 0;
        }
    }

    public double calculateGrossPay() {
        return calculateRegularPay() + calculateOvertimePayUnder50() + calculateOvertimePayOver50();
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + "\n" +
               "Pay Rate: $" + String.format("%.2f", payRate) + "\n" +
               "Hours worked: " + hoursWorked + "\n" +
               "Gross pay: $" + String.format("%.2f", calculateGrossPay()) + "\n";
    }

    // Getters and Setters not shown for brevity
}
