package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // Constructor: booked odalar sıfır olarak başlar
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // Constructor: booked odalar dışarıdan alınır
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // Oda rezervasyonu
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (getAvailableSuites() >= numberOfRooms) {
                bookedSuites += numberOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            if (getAvailableRooms() >= numberOfRooms) {
                bookedBasicRooms += numberOfRooms;
                return true;
            } else {
                return false;
            }
        }
    }

    // Derived getters
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }
}