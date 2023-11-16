package com.workshop.DesignPatterns.creational.prototype.example1;

import lombok.Getter;

@Getter
public class Sheep implements Cloneable {

    private final String name;
    private final int numberOfEyes;


    public Sheep(String name, int numberOfEyes) {
        this.name = name;
        this.numberOfEyes = numberOfEyes;
    }


    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
           return null; // Can ignore as we implement Cloneable
        }
    }
}
