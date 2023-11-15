package com.workshop.DesignPatterns.creational.buider.example1;

public class Shareholder {

    private final String name;

    private Shareholder(Builder builder) {
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Shareholder build() {
            return new Shareholder(this);
        }
    }
    public String getName() {
        return name;
    }

}