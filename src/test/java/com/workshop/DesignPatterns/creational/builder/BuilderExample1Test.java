package com.workshop.DesignPatterns.creational.builder;

import com.workshop.DesignPatterns.creational.buider.example1.FinancialReport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BuilderExample1Test {
    @Test
    public void testBuilderWithTitleAndContent() {
        String title = "Annual Financial Report";
        String content = "This is the content of the report.";

        FinancialReport report = FinancialReport.builder()
                .title(title)
                .content(content)
                .build();

        assertNotNull(report);
        assertEquals(title, report.getTitle());
        assertEquals(content, report.getContent());
        System.out.println("FinancialReport.FinancialReportBuilder(title=" + report.getTitle() + ", content=" + report.getContent() + ")");
    }

}