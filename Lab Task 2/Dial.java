package com.company;

public class Dial {

    // INSTANCE PROPERTIES HERE
    int value;

    //Constructor
    public Dial() {
    }

    public void spin() {
        value = (int) Math.floor(Math.random() * 4); // choose a random value in [0,4)
    }

    public int getValue() {
        return value;
    }

    public char getPicture() {
        // Depending on the value, return the appropriate unicode value
        if (value == 0) // Returns a heart
        {
            return '\u2661';
        } else if (value == 1) // Returns a diamond
        {
            return '\u2662';
        } else if (value == 2) // Returns a spade
        {
            return '\u2664';
        } else // Returns a club
        {
            return '\u2667';
        }
    }

}
