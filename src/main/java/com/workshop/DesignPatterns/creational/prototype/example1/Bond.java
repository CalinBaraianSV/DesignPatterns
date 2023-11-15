package com.workshop.DesignPatterns.creational.prototype.example1;

import lombok.Getter;

@Getter
public class Bond implements FinancialInstrument {
    private String issuer;
    private double interestRate;


    public Bond(String issuer, double interestRate) {
        this.issuer = issuer;
        this.interestRate = interestRate;
    }


    @Override
    public FinancialInstrument clone() {
        try {
            return (FinancialInstrument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can ignore as we implement Cloneable
        }
    }
}
