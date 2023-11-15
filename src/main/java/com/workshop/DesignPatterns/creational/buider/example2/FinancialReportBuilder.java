package com.workshop.DesignPatterns.creational.buider.example2;

public interface FinancialReportBuilder {
    void addTitle();
    void addContent(String content); // Generic content addition
    FinancialReport build();
}

