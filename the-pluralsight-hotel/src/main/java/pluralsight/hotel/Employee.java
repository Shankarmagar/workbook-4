package pluralsight.hotel;

public class Employee {
    // instance variables
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Constructor
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }
    // Calculate TotalPay
    public double getTotalPay() {
        return  payRate * hoursWorked;
    }
    // less than or equal to
    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40; //  40 hours is the regular workweek
        }
    }
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0; // No overtime worked
            // If employee worked 45 hours the output would be 5
        }
    }

}
