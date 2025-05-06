package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        // Testing Room
        Room room = new Room(2, 150.0, false, false);
        System.out.println("Is the room available? " + room.isAvailable());

        // Testing Reservation
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Reservation total: $" + reservation.getReservationTotal());

        // Testing Employee
        Employee employee = new Employee(101, "John", "Front Desk", 20.0, 45);
        System.out.println("Employee total pay: $" + employee.getTotalPay());
    }
}