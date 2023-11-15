package com.workshop.DesignPatterns.creational.builder;

import com.workshop.DesignPatterns.creational.buider.example2.BalanceSheetBuilder;
import com.workshop.DesignPatterns.creational.buider.example2.IncomeStatementBuilder;
import com.workshop.DesignPatterns.creational.buider.example2.ReportDirector;
import com.workshop.DesignPatterns.creational.buider.example2.FinancialReport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuilderExample2Test {

    private ReportDirector incomeStatementDirector;
    private ReportDirector balanceSheetDirector;

    @BeforeEach
    public void setUp() {
        incomeStatementDirector = new ReportDirector(new IncomeStatementBuilder());
        balanceSheetDirector = new ReportDirector(new BalanceSheetBuilder());
    }

    @Test
    public void testIncomeStatementBuilder() {
        String content = "Income Statement Content...";

        FinancialReport report = incomeStatementDirector.constructReport(content);

        System.out.println(report);
    }

    @Test
    public void testBalanceSheetBuilder() {
        String content = "Balance Sheet Content...";

        FinancialReport report = balanceSheetDirector.constructReport(content);
        System.out.println(report);

    }
}