package org.example;

public class Car extends Vehicle {

    @Override
    void move() {
        System.out.println("La macchina si muove...");
    }

    @Override
    void brake() {
        System.out.println("La macchina frena...");
    }
}
