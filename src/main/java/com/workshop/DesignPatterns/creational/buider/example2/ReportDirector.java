package com.workshop.DesignPatterns.creational.buider.example2;

public class ReportDirector {
    private FinancialReportBuilder builder;

    public ReportDirector(FinancialReportBuilder builder) {
        this.builder = builder;
    }

    public FinancialReport constructReport( String content) {
        builder.addTitle();
        builder.addContent(content);
        return builder.build();
    }
}

