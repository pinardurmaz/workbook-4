package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Room test
        Room room1 = new Room(2, 150.0);
        room1.checkIn();
        room1.checkOut();
        room1.cleanRoom();

        // Employee test
        Employee emp = new Employee(101, "John", "Housekeeping", 15.0);
        emp.punchIn(9.0);
        emp.punchOut(17.0);

        System.out.println("Total pay: $" + emp.getTotalPay());
    }
}