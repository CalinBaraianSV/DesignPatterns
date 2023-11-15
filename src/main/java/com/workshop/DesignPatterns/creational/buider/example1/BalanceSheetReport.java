package com.workshop.DesignPatterns.creational.buider.example1;


import java.util.HashMap;

public class BalanceSheetReport extends FinancialReport {

    private HashMap<Shareholder, Double> shareholderEquity;


    private BalanceSheetReport(Builder builder) {
        super(builder);
        this.shareholderEquity = builder.shareholderEquity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public HashMap<Shareholder, Double> getShareholderEquity() {
        return shareholderEquity;
    }

    public static class Builder extends FinancialReport.Builder<Builder> {
        private HashMap<Shareholder, Double> shareholderEquity;

        public Builder shareholderEquity(HashMap<Shareholder, Double> shareholderEquity) {
            this.shareholderEquity = shareholderEquity;
            return this;
        }

        public BalanceSheetReport build() {
            return new BalanceSheetReport(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}