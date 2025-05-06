package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime = -1; // -1 means not punched in

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public double getTotalPay() {
        return hoursWorked * payRate;
    }

    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public void punchIn(double time) {
        if (punchInTime != -1) {
            System.out.println("Already punched in!");
        } else {
            punchInTime = time;
            System.out.println(name + " punched in at " + time);
        }
    }

    public void punchOut(double time) {
        if (punchInTime == -1) {
            System.out.println("You need to punch in first!");
        } else {
            double hours = time - punchInTime;
            hoursWorked += hours;
            System.out.println(name + " punched out at " + time + ", worked " + hours + " hours.");
            punchInTime = -1;
        }
    }
}