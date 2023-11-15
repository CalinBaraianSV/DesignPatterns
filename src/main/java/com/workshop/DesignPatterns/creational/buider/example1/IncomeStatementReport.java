package com.workshop.DesignPatterns.creational.buider.example1;


import java.util.HashMap;

public class IncomeStatementReport extends FinancialReport {

    private HashMap<String, Double> revenue;
    private HashMap<String, Double> expenses;


    private IncomeStatementReport(Builder builder) {
        super(builder);
        this.revenue = builder.revenue;
        this.expenses = builder.expenses;
    }

    public HashMap<String, Double> getRevenue() {
        return revenue;
    }

    public HashMap<String, Double> getExpenses() {
        return expenses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends FinancialReport.Builder<Builder> {
        private HashMap<String, Double> revenue;
        private HashMap<String, Double> expenses;

        public Builder revenue(HashMap<String, Double> revenue) {
            this.revenue = revenue;
            return this;
        }

        public Builder expenses(HashMap<String, Double> expenses) {
            this.expenses = expenses;
            return this;
        }

        public IncomeStatementReport build() {
            return new IncomeStatementReport(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
