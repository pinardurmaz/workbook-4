package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public Room(int numberOfBeds, double price) {
        this(numberOfBeds, price, false, false);
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    // Yeni methodlar:
    public void checkIn() {
        if (isAvailable()) {
            occupied = true;
            dirty = true;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }

    public void checkOut() {
        occupied = false;
        System.out.println("Check-out successful. Room needs cleaning.");
    }

    public void cleanRoom() {
        dirty = false;
        System.out.println("Room has been cleaned.");
    }
}