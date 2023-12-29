package org.example;

public class Pizza {
    String dough;
    String sauce;
    String cheese;
    String extra;

    Pizza (String dough) {
        this.dough = dough;
        System.out.println("Ingredients: " + dough);
    }

    Pizza (String dough, String sauce) {
        this.dough = dough;
        this.sauce = sauce;
        System.out.println("Ingredients: " + dough + ", " + sauce);
    }

    Pizza (String dough, String sauce, String cheese) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        System.out.println("Ingredients: " + dough + ", " + sauce + ", " + cheese);
    }

    Pizza (String dough, String sauce, String cheese, String extra) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.extra = extra;
        System.out.println("Ingredients: " + dough + ", " + sauce + ", " + cheese + ", " + extra);
    }
}
