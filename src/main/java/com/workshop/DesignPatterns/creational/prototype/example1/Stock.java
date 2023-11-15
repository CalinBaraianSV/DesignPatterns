package com.workshop.DesignPatterns.creational.prototype.example1;

import lombok.Getter;

@Getter
public class Stock implements FinancialInstrument {
    private String ticker;
    private double price;

    // Constructors, getters, and setters

    public Stock(String ticker, double price) {
        this.ticker = ticker;
        this.price = price;
    }

    // Implement clone method
    @Override
    public FinancialInstrument clone() {
        try {
            return (FinancialInstrument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can ignore as we implement Cloneable
        }
    }
}