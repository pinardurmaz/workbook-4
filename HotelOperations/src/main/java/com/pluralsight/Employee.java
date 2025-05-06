package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double lastPunchIn;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public void punchIn(double time) {
        lastPunchIn = time;
    }

    public void punchOut(double time) {
        double hours = time - lastPunchIn;
        hoursWorked += hours;
    }

    // Overloaded - no parameter
    public void punchIn() {
        LocalTime now = LocalTime.now();
        lastPunchIn = now.getHour() + now.getMinute() / 60.0;
    }

    public void punchOut() {
        LocalTime now = LocalTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        double hours = time - lastPunchIn;
        hoursWorked += hours;
    }

    public double getTotalPay() {
        return hoursWorked * payRate;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }
}