package com.workshop.DesignPatterns.creational.builder;

import com.workshop.DesignPatterns.creational.buider.example1.BalanceSheetReport;
import com.workshop.DesignPatterns.creational.buider.example1.IncomeStatementReport;
import com.workshop.DesignPatterns.creational.buider.example1.Shareholder;

import java.util.HashMap;

public class BuilderExample1Test {

    public static void main(String[] args) {
        // Create a shareholders
        Shareholder shareholder1 = Shareholder.builder()
                .name("Jane Smith")
                .build();
        Shareholder shareholder2 = Shareholder.builder()
                .name("John Smith")
                .build();

        // Create a BalanceSheetReport
        HashMap<Shareholder, Double> shareholderEquity = new HashMap<>();
        shareholderEquity.put(shareholder1, 50.0);
        shareholderEquity.put(shareholder2, 50.0);

        BalanceSheetReport balanceSheet = BalanceSheetReport.builder()
                .title("Balance Sheet 2023")
                .content("Balance Sheet Content")
                .shareholderEquity(shareholderEquity)
                .build();

        // Create an IncomeStatementReport
        HashMap<String, Double> revenue = new HashMap<>();
        revenue.put("Product Sales", 50000.0);
        HashMap<String, Double> expenses = new HashMap<>();
        expenses.put("Marketing", 10000.0);

        IncomeStatementReport incomeStatement = IncomeStatementReport.builder()
                .title("Income Statement 2023")
                .content("Income Statement Content")
                .revenue(revenue)
                .expenses(expenses)
                .build();

        System.out.println("Balance Sheet Report:");
        System.out.println("Title: " + balanceSheet.getTitle());
        System.out.println("Content: " + balanceSheet.getContent());
        balanceSheet.getShareholderEquity().forEach((key, value) -> System.out.println("Shareholder name: " + key.getName() + ", Value: " + value));

        System.out.println("\nIncome Statement Report:");
        System.out.println("Title: " + incomeStatement.getTitle());
        System.out.println("Content: " + incomeStatement.getContent());
        incomeStatement.getRevenue().forEach((key, value) -> System.out.println("Revenue name: " + key + ", Value: " + value));
        incomeStatement.getExpenses().forEach((key, value) -> System.out.println("Expense name: " + key + ", Value: " + value));


    }
}
