package com.workshop.DesignPatterns.creational.buider.example2;

public class BalanceSheetBuilder implements FinancialReportBuilder {
    private FinancialReport report = new FinancialReport();

    @Override
    public void addTitle() {report.setTitle("Balance Sheet 2023");
    }

    @Override
    public void addContent(String content) {
        report.setContent(content);
    }

    @Override
    public FinancialReport build() {
        return report;
    }
}
