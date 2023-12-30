package work;

import java.io.*;
import java.util.*;

public class EmployeeTester {
    public static void main(String[] args) {
        List<Employee> employees = readEmployeesFromFile("employees.txt");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    private static List<Employee> readEmployeesFromFile(String fileName) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                // Assuming the file format is: EmployeeNumber,Job,Payrate,HoursWorked
                int employeeId = Integer.parseInt(data[0].trim());
                String job = data[1].trim();
                double payRate = Double.parseDouble(data[2].replace("$", "").trim());
                double hoursWorked = Double.parseDouble(data[3].trim());
                employees.add(new Employee(employeeId, job, payRate, hoursWorked));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
