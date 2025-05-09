package com.pluralsight;

public class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getValue() {
        if ("JQK".contains(rank)) return 10;
        if ("A".equals(rank)) return 11;
        return Integer.parseInt(rank);
    }

    public String toString() {
        return rank + " of " + suit;
    }

    public String getRank() {
        return rank;
    }
}