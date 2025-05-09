package com.pluralsight;

public class Player {
    private String name;
    private Hand hand = new Hand();

    public Player(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
}