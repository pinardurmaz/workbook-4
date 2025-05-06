package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create a new hotel
        Hotel myHotel = new Hotel("Sunset Hotel", 5, 10); // 5 suites, 10 basic rooms

        // Show available rooms before booking
        System.out.println("Available suites at start: " + myHotel.getAvailableSuites());
        System.out.println("Available basic rooms at start: " + myHotel.getAvailableRooms());

        // Try booking 2 suites and 3 basic rooms
        boolean suiteBooked = myHotel.bookRoom(2, true); // suite
        boolean roomBooked = myHotel.bookRoom(3, false); // basic room

        System.out.println("Booking 2 suites successful? " + suiteBooked);
        System.out.println("Booking 3 basic rooms successful? " + roomBooked);

        // Show available rooms after booking
        System.out.println("Remaining suites: " + myHotel.getAvailableSuites());
        System.out.println("Remaining basic rooms: " + myHotel.getAvailableRooms());

        // Try to overbook (e.g., 10 more suites)
        boolean failBooking = myHotel.bookRoom(10, true);
        System.out.println("Booking 10 more suites successful? " + failBooking);
    }
}